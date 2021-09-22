package com.bridgelabz.workshop;

import java.util.ArrayList;
import java.util.List;

/**
 * @class member hoteInfo is used to store the information about hotels
 */
public class HotelReservationSystem {
	
	public static List <Hotel> hotelInfo = new ArrayList<>();

	/**
	 * This method is used to add the hotel and its information to the hotelInfo ArrayList
	 * @param hotelName is the name of the hotel
	 * @param rating is its rating
	 * @param rateForRegularCustomer is the rate for regular customer on weekdays
	 * @param rateForRewardCustomer is the rate for reward customer on weekdays
	 * @param weekendRateForRegularCustomer is the rate for regular customer on weekends
	 * @param weekendRateForRewardCustomer is the rate for reward customer on weekends
	 */
	public static void addHotels(String hotelName, int rating, double rateForRegularCustomer, double rateForRewardCustomer,double weekendRateForRegularCustomer,double weekendRateForRewardCustomer) {
		hotelInfo.add(new Hotel(hotelName,rating,rateForRegularCustomer,rateForRewardCustomer,weekendRateForRegularCustomer,weekendRateForRewardCustomer));
	}

}
