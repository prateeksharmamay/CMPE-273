package javaSection.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrequencyCounterTestPositive {

	@Test
	public void testCounterPositive() {
		FrequencyCounter fcTest = new FrequencyCounter();
		int arr[] = {1,2,3,2,1};
		int res[] = fcTest.counter(5, arr);
		int verify[] = {2,2,1,0,0};
		assertArrayEquals(verify, res);
	}
}
