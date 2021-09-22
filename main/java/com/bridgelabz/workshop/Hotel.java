package com.bridgelabz.workshop;

/**
 * @class member hotelName is the name of the hotel
 * @class member rating is its rating
 * @class member rateForRegularCustomer is the rate for regular customer on weekdays
 * @class member rateForRewardCustomer is the rate for reward customer on weekdays
 * @class member weekendRateForRegularCustomer is the rate for regular customer on weekends
 * @class member weekendRateForRewardCustomer is the rate for reward customer on weekends
 */

public class Hotel {
	private String hotelName;
	private int rating;
	private double rateForRegularCustomer;
	private double rateForRewardCustomer;
	private double weekendRateForRegularCustomer;
	private double weekendRateForRewardCustomer;

	public Hotel(String hotelName, int rating, double rateForRegularCustomer, double rateForRewardCustomer,double weekendRateForRegularCustomer,double weekendRateForRewardCustomer) {
		super();
		this.hotelName = hotelName;
		this.rating = rating;
		this.rateForRegularCustomer = rateForRegularCustomer;
		this.rateForRewardCustomer = rateForRewardCustomer;
		this.weekendRateForRegularCustomer = weekendRateForRegularCustomer;
		this.weekendRateForRewardCustomer = weekendRateForRewardCustomer;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", rating=" + rating + ", rateForRegularCustomer="
				+ rateForRegularCustomer + ", rateForRewardCustomer=" + rateForRewardCustomer
				+ ", weekendRateForRegularCustomer=" + weekendRateForRegularCustomer + ", weekendRateForRewardCustomer="
				+ weekendRateForRewardCustomer + "]";
	}	
}
