package javaSection.Collections;

import static org.junit.Assert.*;

import org.junit.Test;

public class CacheDetailsTestNegative {

	CacheDetails cdetailsTest = new CacheDetails();
	
	@Test
	public void testGetDetailsNegative1() {
		assertFalse(cdetailsTest.getDetails("", "USA"));
	}
	
	@Test
	public void testGetDetailsNegative2() {
		assertFalse(cdetailsTest.getDetails("", ""));
	}
	
	@Test
	public void testGetDetailsNegative3() {
		assertFalse(cdetailsTest.getDetails("www.google.com", ""));
	}
	

	@Test
	public void testShowDetailsNegative() {
		assertFalse(cdetailsTest.showDetails());
	}

}
