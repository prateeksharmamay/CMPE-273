package javaSection.Generics;

import static org.junit.Assert.*;

import org.junit.Test;

public class ElectronicsTest {
	
	Electronics gadget = new Electronics();
	boolean addedItem = gadget.setElectronicsDetails("iPod Nano", 99);

	@Test
	public void testSetElectronicsDetails() {
		assertTrue(addedItem);	}

	@Test
	public void testGetName() {
		assertEquals("iPod Nano", gadget.getName());
	}

	@Test
	public void testGetCost() {
		assertEquals(99, gadget.getCost());
	}

}
