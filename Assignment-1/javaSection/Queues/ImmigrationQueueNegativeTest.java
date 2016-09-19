package javaSection.Queues;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImmigrationQueueNegativeTest {

	ImmigrationQueue visitorTest = new ImmigrationQueue();
	boolean addedVisitor = visitorTest.addVisitor("", "10/01/1990", "D8975632", "India", "", "Studies", "13/08/2016");
	
	@Test
	public void testAddVisitor() {
		assertFalse(addedVisitor);
	}
	
	@Test
	public void testQueueSize() {
		assertEquals(0, visitorTest.queueSize());
	}

	@Test
	public void testQEmpty() {
		assertTrue(visitorTest.qEmpty());
	}
	
	//boolean attendedVisitor = visitorTest.attendedVisitor();
	
	@Test
	public void testAttendedVisitor() {
		assertFalse(visitorTest.attendedVisitor());
	}
}
