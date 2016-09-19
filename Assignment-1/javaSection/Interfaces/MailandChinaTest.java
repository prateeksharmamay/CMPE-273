package javaSection.Interfaces;

import static org.junit.Assert.*;

import org.junit.Test;

public class MailandChinaTest {

	MailandChina mc = new MailandChina();
	
	@Test
	public void testRestaurantMenu() {
		assertTrue(mc.restaurantMenu("Noodles, Munchurion"));
		assertFalse(mc.restaurantMenu(""));
	}

	@Test
	public void testCalculateBill() {
		assertEquals(1500,mc.calculateBill(500,3));
	}
}
