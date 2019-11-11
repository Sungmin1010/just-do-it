package easy;
//https://www.hackerrank.com/challenges/divisible-sum-pairs/problem

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisibleSumPairs {
	// i<j  and ar[i] + ar[j] % k == 0; 
	static int divisibleSumPairs(int n, int k, int[] ar) {
		return 0;
	}
	
	@Test
	public void testDivisibleSumPairs() throws Exception {
		int n = 6;
		int k = 3;
		int[] ar = new int[] {1,3,2,6,1,2};
		
		assertEquals(5, divisibleSumPairs(n, k, ar));
	}

}
