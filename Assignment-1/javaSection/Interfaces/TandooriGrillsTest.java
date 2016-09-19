package javaSection.Interfaces;

import static org.junit.Assert.*;

import org.junit.Test;

public class TandooriGrillsTest {

	TandooriGrills tg = new TandooriGrills();
	
	@Test
	public void testRestaurantMenu() {
		assertTrue(tg.restaurantMenu("Noodles, Munchurion"));
		assertFalse(tg.restaurantMenu(""));
	}

	@Test
	public void testCalculateBill() {
		assertEquals(1500,tg.calculateBill(500,3));
	}

}
