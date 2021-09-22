package com.bridgelabz.workshop;

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
