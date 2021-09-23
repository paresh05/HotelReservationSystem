package com.bridgelabz.workshop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

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
	public List <String> cheapestHotelList = new ArrayList<String>(); 
	public List <String> bestRatedHotel = new ArrayList<String>(); 
	public double cheapestRate;
	public long daysBetween;
	public int startDay;

	/**
	 * This method is used to add the hotel and its information to the hotelInfo ArrayList
	 * @param hotelName is the name of the hotel
	 * @param rating is the rating of the hotel
	 * @param rateOnWeekdays is the rate of the room for a day on weekdays
	 * @param rateOnWeekends is the rate of the room for a day on weekends
	 */
	public int addHotels(String hotelName, int rating, double rateOnWeekdays, double rateOnWeekends) {
		hotelInfo.add(new Hotel(hotelName,rating,rateOnWeekdays,rateOnWeekends));
		return  hotelInfo.size();
	}

	/**
	 * This method is used to calculate the number of days when the dates are passed
	 * @param startDate is the beginning of the range of days
	 * @param endDate is the last day of the range
	 * @return daysBetween the entered range of days
	 */
	public long numberOfDays(String startDate, String endDate) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date1 = LocalDate.parse(startDate,dtf);
		startDay = date1.getDayOfWeek().getValue();
		LocalDate date2 = LocalDate.parse(endDate,dtf);
		daysBetween = (ChronoUnit.DAYS.between(date1, date2)+1);
		return daysBetween;
	}

	/**This function is used to get the total rates of the hotel when the number of days are passed
	 * @return totalRate of the hotel 
	 */
	public double getTotoalRatesOfHotel(Hotel element) {
		int day = startDay;
		double totalRate=0;
		for(int i = 0;i < daysBetween;i++) {
			if(day==6||day==7) 
				totalRate=totalRate+element.getRateOnWeekends();
			else 
				totalRate=totalRate+element.getRateOnWeekdays();
			day++;
			if(day==8)
				day=1;
		}
		return totalRate;
	}

	/**
	 * This method is used to get the cheapest hotel in the list of hotels
	 * @return the total rate of the cheapest hotel
	 */
	public int cheapestHotel() {
		cheapestRate = getTotoalRatesOfHotel(hotelInfo.get(2));
		for(Hotel element : hotelInfo) {
			double hotelrate = getTotoalRatesOfHotel(element);
			if(hotelrate < cheapestRate) {
				cheapestRate = hotelrate;
				cheapestHotelList.clear();
				cheapestHotelList.add(element.getHotelName());
			}
			else if(hotelrate == cheapestRate) {
				cheapestHotelList.add(element.getHotelName());
			}
		}
		return  (int) (cheapestRate);
	}

	/**This method id used to get the best rated hotels from the list given
	 * @return rating of the best rated hotel from the list
	 */
	public int getBestRating() {
		int rating=0;
		for(int i = 0; i < hotelInfo.size();i++) {
			for(String element : cheapestHotelList) {
				if(element == hotelInfo.get(i).getHotelName()) {
					if(hotelInfo.get(i).getRating() > rating) {
						rating = hotelInfo.get(i).getRating();
						bestRatedHotel.clear();
						bestRatedHotel.add(hotelInfo.get(i).getHotelName());
					}
					else if(hotelInfo.get(i).getRating() == rating)
						bestRatedHotel.add(hotelInfo.get(i).getHotelName());
				}
			}
		}
		return rating;
	}

	/**
	 * This function is used to return the name of the cheapest hotel 
	 * @return the hotel name of the cheapest hotel
	 */
	public String getHotels() {
		return cheapestHotelList.toString();
	}

	/**
	 * This function is used to return the name of the best rated hotel 
	 * @return the hotel name of the best rated hotel
	 */
	public String getBestRatedHotels() {
		return bestRatedHotel.toString();
	}
}
