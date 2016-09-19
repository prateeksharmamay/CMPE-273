package javaSection.Arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrequencyCounterTestNegative {

	@Test
	public void testCounterNegatives() {
		FrequencyCounter fcTest = new FrequencyCounter();
		int arr[] = {1,2,3,2,1};
		int res[] = fcTest.counter(5, arr);
		int verify[] = {1,1,1,0,0};
		Boolean boolRes = verify.equals(res);
		assertFalse(boolRes);
	}
}
