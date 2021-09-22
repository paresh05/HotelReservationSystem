package com.bridgelabz.workshop;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationSystemTest {

	@Test

	public void givenCorrectInputShouldReturnTrue() {
		
		HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();

		Assert.assertEquals(true,hotelReservationSystem.addHotels("Lakewood",3,110,80.0,90,80));
		Assert.assertEquals(true,hotelReservationSystem.addHotels("Bridgewood",4,160,110.0,60,50));
		Assert.assertEquals(true,hotelReservationSystem.addHotels("Ridgewood",5,220,50.0,150,40));
		
	}
}
