package com.bridgelabz.workshop;

import org.junit.Test;

public class hotelReservationSystemTest {

	@Test

	public void givenCorrectInputShouldReturnTrue() {
		HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
		hotelReservationSystem.addHotels("Lakewood",3,110,80.0,90,80);
		hotelReservationSystem.addHotels("Bridgewood",4,160,110.0,60,50);
		hotelReservationSystem.addHotels("Ridgewood",5,220,50.0,150,40);
	}
}
