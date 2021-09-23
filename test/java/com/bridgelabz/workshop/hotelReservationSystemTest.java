package com.bridgelabz.workshop;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HotelReservationSystemTest {
	HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
	
	@Before
	public void givenHotelDetailsWhenAddedShouldReturnTrue() {
		Assert.assertEquals(1,hotelReservationSystem.addHotels("Lakewood",3,110,90));
		Assert.assertEquals(2,hotelReservationSystem.addHotels("Bridgewood",4,150,50));
		Assert.assertEquals(3,hotelReservationSystem.addHotels("Ridgewood",5,220,150));
	}
	
	@Test
	public void givenDateCalculateCheapestHotelShouldReturnTrue() {
		hotelReservationSystem.numberOfDays("10/09/2021", "11/09/2021");
		Assert.assertEquals(200, hotelReservationSystem.cheapestHotel());
		Assert.assertEquals(("[Lakewood, Bridgewood]"),(hotelReservationSystem.getHotels()));
		
	}
}
