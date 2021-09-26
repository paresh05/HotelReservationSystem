package com.bridgelabz.workshop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @class member hoteInfo is used to store the information about hotels
 * @class member cheapestHotel is used to store the hotelName of the cheapest hotels 
 * @class member bestRatedHotel is used to store the hotelName of the best rated hotels 
 * @class member cheapestRate is used to store the total rate of the cheapest hotel 
 * @class member daysBetween is used to store the number of days in the given range of dates
 * @class member startDay is used to store the day of the start date
 */
public class HotelReservationSystem {

	public List <Hotel> hotelInfo = new ArrayList<Hotel>(); 
	public List <Hotel> cheapestHotelList = new ArrayList<Hotel>(); 
	public List <Hotel> bestRatedHotel = new ArrayList<Hotel>(); 
	public double cheapestRate;
	public long daysBetween;
	public int startDay;
	public int rewardCustomer;

	/**
	 * This method is used to add the hotel and its information to the hotelInfo ArrayList
	 * @param hotelName is the name of the hotel
	 * @param rating is its rating
	 * @param rateForRegularCustomer is the rate for regular customer on weekdays
	 * @param rateForRewardCustomer is the rate for reward customer on weekdays
	 * @param weekendRateForRegularCustomer is the rate for regular customer on weekends
	 * @param weekendRateForRewardCustomer is the rate for reward customer on weekends
	 */
	public int addHotels(String hotelName, int rating, double rateForRegularCustomer,double weekendRateForRegularCustomer, double rateForRewardCustomer, double weekendRateForRewardCustomer) {
		hotelInfo.add(new Hotel(hotelName,rating,rateForRegularCustomer,weekendRateForRegularCustomer,rateForRewardCustomer,weekendRateForRewardCustomer));
		return  hotelInfo.size();
	}

	/**
	 * This method is used to calculate the number of days when the dates are passed
	 * @param startDate is the beginning of the range of days
	 * @param endDate is the last day of the range
	 * @return daysBetween the entered range of days
	 * @throws HotelReservationException 
	 */
	public long numberOfDays(String startDate, String endDate) throws HotelReservationException {
		String dateRegex = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[012])-((19|2[0-9])[0-9]{2})$";
		Pattern pt = Pattern.compile(dateRegex);
		Matcher mt = pt.matcher(startDate);
		boolean result = mt.matches();
		if(result) {
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate date1 = LocalDate.parse(startDate,dtf);
			startDay = date1.getDayOfWeek().getValue();
			LocalDate date2 = LocalDate.parse(endDate,dtf);
			daysBetween = (ChronoUnit.DAYS.between(date1, date2)+1);
		}
		else {
			throw new HotelReservationException("Please Enter Valid Date");
		}
		return daysBetween;
	}

	/**This function is used to get the total rates of the hotel when the number of days are passed
	 * @return totalRate of the hotel 
	 */
	public int getTotoalRatesOfHotel(Hotel element) {
		int day = startDay;
		double totalRate=0;
		for(int i = 0;i < daysBetween;i++) {
			if(rewardCustomer == 0) {
				if(day==6||day==7) 
					totalRate=totalRate+element.getRateForRegularCustomer();
				else 
					totalRate=totalRate+element.getWeekendRateForRegularCustomer();
			}
			else if(rewardCustomer == 1) {
				if(day==6||day==7) 
					totalRate=totalRate+element.getRateForRewardCustomer();
				else 
					totalRate=totalRate+element.getWeekendRateForRewardCustomer();
			}
			day++;
			if(day==8)
				day=1;
		}
		return (int)totalRate;
	}

	/**
	 * This method is used to get the cheapest hotel in the list of hotels
	 * @return the total rate of the cheapest hotel
	 */
	public int cheapestHotel(int customerType) {
		rewardCustomer = customerType;
		cheapestRate = getTotoalRatesOfHotel(hotelInfo.get(2));
		for(Hotel element : hotelInfo) {
			double hotelrate = getTotoalRatesOfHotel(element);
			if(hotelrate < cheapestRate) {
				cheapestRate = hotelrate;
				cheapestHotelList.clear();
				cheapestHotelList.add(element);
			}
			else if(hotelrate == cheapestRate) {
				cheapestHotelList.add(element);
			}
		}
		return (int)(cheapestRate);
	}

	/**This method id used to get the best rated hotels from the list given
	 * @return rating of the best rated hotel from the list
	 */
	public int getBestRating(List<Hotel> hotelList) {
		int rating = 0;
		for(Hotel element : hotelList) {
			if(element.getRating() > rating) {
				rating = element.getRating();
				bestRatedHotel.clear();
				bestRatedHotel.add(element);
			}
			else if(element.getRating() == rating)
				bestRatedHotel.add(element);
		}
		return rating;
	}
	/**
	 * This function is used to return the name of the hotel of the hotel list passed
	 * @return the names of the hotels
	 */
	public String getHotels(List<Hotel> hotelList) {
		List <String> hotelName = new ArrayList<String>(); 
		hotelList.stream().forEach(element -> hotelName.add(element.getHotelName()));
		return hotelName.toString();
	}
}
