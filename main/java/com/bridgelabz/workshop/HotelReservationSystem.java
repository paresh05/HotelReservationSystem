package com.bridgelabz.workshop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 * @class member hoteInfo is used to store the information about hotels
 */
public class HotelReservationSystem {

	public List <Hotel> hotelInfo = new ArrayList<Hotel>(); 
	public double cheapestRate;
	public long daysBetween;

	/**
	 * This method is used to add the hotel and its information to the hotelInfo ArrayList
	 * @param hotelName is the name of the hotel
	 * @param rate is the rate of the room for a day
	 */
	public int addHotels(String hotelName, double rateOnWeekdays, double rateOnWeekends) {
		hotelInfo.add(new Hotel(hotelName,rateOnWeekdays,rateOnWeekends));
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
		LocalDate date2 = LocalDate.parse(endDate,dtf);
		daysBetween = (ChronoUnit.DAYS.between(date1, date2)+1);
		return daysBetween;
	}

	/**
	 * This method is used to get the cheapest hotel in the list of hotels
	 * @return the total rate for the number of days of the cheapest hotel
	 */
	public int cheapestHotel() {
		cheapestRate = hotelInfo.get(1).getRateOnWeekdays();
		for(Hotel element : hotelInfo) {
			double hotelrate = element.getRateOnWeekdays();
			if(hotelrate <= cheapestRate)
				cheapestRate = hotelrate;
		}
		return  (int) (cheapestRate*daysBetween);
	}

	/**
	 * This function is used to get the name of the cheapest hotel using its rate
	 * @return the hotel name of the cheapest hotel
	 */
	public String getHotels() {
		for(Hotel element : hotelInfo) {
			if(element.getRateOnWeekdays() == cheapestRate) {
				return element.getHotelName();
			}
		}
		return hotelInfo.get(1).getHotelName();
	}
}
