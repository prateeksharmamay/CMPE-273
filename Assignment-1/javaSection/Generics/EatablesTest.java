package javaSection.Generics;

import static org.junit.Assert.*;

import org.junit.Test;

public class EatablesTest {
	
	Eatables eatable = new Eatables();
	boolean addedItem = eatable.setEatables("Apples", 4);

	@Test
	public void testSetEatables() {
		assertTrue(addedItem);
	}

	@Test
	public void testGetName() {
		assertEquals("Apples", eatable.getName());
	}

	@Test
	public void testGetCost() {
		assertEquals(4, eatable.getCost());
	}

}
