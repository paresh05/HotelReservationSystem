package com.bridgelabz.workshop;

/**
 * @class member hotelName is the name of the hotel
 * @class member rateOnWeekdays is the rate of the room for a day on weekdays
 * @class member rateOnWeekends is the rate of the room for a day on weekends
 */

public class Hotel {
	
	private String hotelName;
	private double rateOnWeekdays;
	private double rateOnWeekends;
	
	public Hotel(String hotelName, double rateOnWeekdays, double rateOnWeekends) {
		this.hotelName = hotelName;
		this.rateOnWeekdays = rateOnWeekdays;
		this.rateOnWeekends = rateOnWeekends;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public double getRateOnWeekdays() {
		return rateOnWeekdays;
	}

	public void setRateOnWeekdays(double rateOnWeekdays) {
		this.rateOnWeekdays = rateOnWeekdays;
	}

	public double getRateOnWeekends() {
		return rateOnWeekends;
	}

	public void setRateOnWeekends(double rateOnWeekends) {
		this.rateOnWeekends = rateOnWeekends;
	}

	@Override
	public String toString() {
		return "Hotel [hotelName=" + hotelName + ", rateOnWeekdays=" + rateOnWeekdays + ", rateOnWeekends="
				+ rateOnWeekends + "]";
	}
}
