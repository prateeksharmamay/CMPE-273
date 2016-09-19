package javaSection.Stacks;

import static org.junit.Assert.*;

import org.junit.Test;

public class AirportHotelShuttleTest {

	AirportHotelShuttle passenger = new AirportHotelShuttle(3);
	boolean boardBus1 = passenger.boardBus("Vivek");
	boolean boardBus2 = passenger.boardBus("Kunal");
	boolean boardBus3 = passenger.boardBus("Prateek");

	@Test
	public void testAirportHotelShuttle() {
		assertEquals(3, passenger.getBusCapacity());
		
	}
	
	@Test
	public void testBoardBus() {
		assertTrue(boardBus1);
		assertTrue(boardBus2);
		assertTrue(boardBus3);
	}

	@Test
	public void testNoOfPassengers() {
		assertEquals(3, passenger.noOfPassengers());
	}

	@Test
	public void testBusEmpty() {
		assertFalse(passenger.busEmpty());
	}

	@Test
	public void testNextPassengerToLeave() {
		System.out.println("passenger.nextPassengerToLeave()"+passenger.nextPassengerToLeave());
		assertEquals("Prateek", passenger.nextPassengerToLeave());
		assertNotEquals("Kunal", passenger.nextPassengerToLeave());;
		assertNotEquals("Vivek", passenger.nextPassengerToLeave());;
	}
	
	@Test
	public void testLeaveBus() {
		assertTrue(passenger.leaveBus());
		assertTrue(passenger.leaveBus());
		assertTrue(passenger.leaveBus());
		assertFalse(passenger.leaveBus());
	}
}
