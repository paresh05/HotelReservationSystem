package com.bridgelabz.workshop;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HotelReservationSystemTest {
	HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();

	@Before
	public void givenHotelDetailsWhenAddedShouldReturnTrue() {
		Assert.assertEquals(1,hotelReservationSystem.addHotels("Lakewood",3,110,90,80,80));
		Assert.assertEquals(2,hotelReservationSystem.addHotels("Bridgewood",4,150,50,110,50));
		Assert.assertEquals(3,hotelReservationSystem.addHotels("Ridgewood",5,220,150,100,40.));
	}

	@Test
	public void givenDateCalculateCheapestHotelShouldReturnTrue() {
		try {
			hotelReservationSystem.numberOfDays("10-09-2021", "11-09-2021");
			Assert.assertEquals(200, hotelReservationSystem.cheapestHotel(0));
			Assert.assertEquals(("[Lakewood, Bridgewood]"),(hotelReservationSystem.getHotels(hotelReservationSystem.cheapestHotelList)));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenDateCalculateBestRatedCheapestHotelShouldReturnTrue() {
		try {
			hotelReservationSystem.numberOfDays("10-09-2021", "11-09-2021");
			Assert.assertEquals(200, hotelReservationSystem.cheapestHotel(0));
			Assert.assertEquals(4, hotelReservationSystem.getBestRating(hotelReservationSystem.cheapestHotelList));
			Assert.assertEquals(("[Bridgewood]"),(hotelReservationSystem.getHotels(hotelReservationSystem.bestRatedHotel)));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

	@Test
	public void givenDateCalculateBestRatedHotelShouldReturnTrue() {
		try {
			hotelReservationSystem.numberOfDays("10-09-2021", "11-09-2021");
			Assert.assertEquals(5, hotelReservationSystem.getBestRating(hotelReservationSystem.hotelInfo));
			Assert.assertEquals(("[Ridgewood]"),(hotelReservationSystem.getHotels(hotelReservationSystem.bestRatedHotel)));
			Assert.assertEquals(370, hotelReservationSystem.getTotoalRatesOfHotel((hotelReservationSystem.bestRatedHotel.get(0))));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void givenDateCalculateBestRatedCheapestHotelForRewardCustomerShouldReturnTrue() {
		try {
			hotelReservationSystem.numberOfDays("10-09-2021", "11-09-2021");
			Assert.assertEquals(140, hotelReservationSystem.cheapestHotel(1));
			Assert.assertEquals(5, hotelReservationSystem.getBestRating(hotelReservationSystem.cheapestHotelList));
			Assert.assertEquals(("[Ridgewood]"),(hotelReservationSystem.getHotels(hotelReservationSystem.bestRatedHotel)));
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
