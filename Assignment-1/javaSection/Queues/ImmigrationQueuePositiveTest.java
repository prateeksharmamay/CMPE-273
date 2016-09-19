package javaSection.Queues;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImmigrationQueuePositiveTest {
	ImmigrationQueue visitorTest = new ImmigrationQueue();
	boolean addedVisitor = visitorTest.addVisitor("Prateek", "10/01/1990", "D8975632", "India", "F1", "Studies", "13/08/2016");
	
	@Test
	public void testAddVisitor() {
		assertTrue(addedVisitor);
	}
	
	@Test
	public void testQueueSize() {
		assertEquals(1, visitorTest.queueSize());
	}

	@Test
	public void testQEmpty() {
		assertFalse(visitorTest.qEmpty());
	}
	
	@Test
	public void testAttendedVisitor() {
		assertTrue(visitorTest.attendedVisitor());
	}
}
