package com.bridgelabz.workshop;

/**
 * @class member hotelName is the name of the hotel
 * @class member rate is the rate of the room for a day
 */

public class Hotel {
	
	private String hotelName;
	private double rate;

	public Hotel(String hotelName, double rate) {
		super();
		this.hotelName = hotelName;
		this.rate = rate;
	}
	
	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", rate=" + rate + "]";
	}
}
