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
	private double weekendRateForRegularCustomer;
	private double rateForRewardCustomer;
	private double weekendRateForRewardCustomer;

	public Hotel(String hotelName, int rating, double rateForRegularCustomer, double weekendRateForRegularCustomer , double rateForRewardCustomer, double weekendRateForRewardCustomer) {
		super();
		this.hotelName = hotelName;
		this.rating = rating;
		this.rateForRegularCustomer = rateForRegularCustomer;
		this.weekendRateForRegularCustomer = weekendRateForRegularCustomer;
		this.rateForRewardCustomer = rateForRewardCustomer;
		this.weekendRateForRewardCustomer = weekendRateForRewardCustomer;
	}


	public String getHotelName() {
		return hotelName;
	}


	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public double getRateForRegularCustomer() {
		return rateForRegularCustomer;
	}


	public void setRateForRegularCustomer(double rateForRegularCustomer) {
		this.rateForRegularCustomer = rateForRegularCustomer;
	}


	public double getRateForRewardCustomer() {
		return rateForRewardCustomer;
	}


	public void setRateForRewardCustomer(double rateForRewardCustomer) {
		this.rateForRewardCustomer = rateForRewardCustomer;
	}


	public double getWeekendRateForRegularCustomer() {
		return weekendRateForRegularCustomer;
	}


	public void setWeekendRateForRegularCustomer(double weekendRateForRegularCustomer) {
		this.weekendRateForRegularCustomer = weekendRateForRegularCustomer;
	}


	public double getWeekendRateForRewardCustomer() {
		return weekendRateForRewardCustomer;
	}


	public void setWeekendRateForRewardCustomer(double weekendRateForRewardCustomer) {
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