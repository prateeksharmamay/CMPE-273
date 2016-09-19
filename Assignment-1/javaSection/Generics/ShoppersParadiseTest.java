package javaSection.Generics;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ShoppersParadiseTest {
	Eatables eatable1 = new Eatables();
	Eatables eatable2 = new Eatables();
	Eatables eatable3 = new Eatables();
	List<Eatables> eatablesList = new ArrayList<Eatables>();
	ShoppersParadise<Eatables> cartE = new ShoppersParadise<Eatables>();

	@Test
	public void testCheckout() {
		eatable1.setEatables("Apples", 4);
		eatablesList.add(eatable1);
		eatable2.setEatables("Cereals", 10);
		eatablesList.add(eatable2);
		eatable3.setEatables("Milk", 10);
		eatablesList.add(eatable3);
		
		int bill = cartE.checkout(eatablesList);
		assertEquals(24, bill);
	}

}
