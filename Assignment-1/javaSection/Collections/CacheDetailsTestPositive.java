package javaSection.Collections;

import static org.junit.Assert.*;

import org.junit.Test;

public class CacheDetailsTestPositive {
	
	CacheDetails cdetailsTest = new CacheDetails();
	boolean getDetails = cdetailsTest.getDetails("www.google.com", "USA");
	boolean showDetails = cdetailsTest.showDetails();
	
	@Test
	public void testGetDetails() {
		assertTrue(getDetails);
	}

	@Test
	public void testShowDetails() {
		
		assertTrue(showDetails);
	}

}
