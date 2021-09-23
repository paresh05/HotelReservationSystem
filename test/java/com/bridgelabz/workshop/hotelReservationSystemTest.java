package com.bridgelabz.workshop;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HotelReservationSystemTest {
	HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
	
	@Before
	public void givenHotelDetailsWhenAddedShouldReturnTrue() {
		Assert.assertEquals(1,hotelReservationSystem.addHotels("Lakewood",110,90));
		Assert.assertEquals(2,hotelReservationSystem.addHotels("Bridgewood",150,50));
		Assert.assertEquals(3,hotelReservationSystem.addHotels("Ridgewood",220,150));
	}
	
	@Test
	public void givenDateCalculateCheapestHotelShouldReturnTrue() {
		hotelReservationSystem.numberOfDays("10/09/2021", "11/09/2021");
		Assert.assertEquals(200, hotelReservationSystem.cheapestHotel());
		Assert.assertEquals(("[Lakewood, Bridgewood]"),(hotelReservationSystem.getHotels()));
		
	}
}
