package easy;
//https://www.hackerrank.com/challenges/divisible-sum-pairs/problem

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisibleSumPairs {
	// i<j  and ar[i] + ar[j] % k == 0; 
	static int divisibleSumPairs(int n, int k, int[] ar) {
	//i=0부터 i<n-1까지  for문을 돈다.
	//ar[i]를 기준으로 i+1 인덱스 값부터 n-1 인덱스 까지 for문을 돈다 
	//조건에 만족하는 값이 존재하는지 확인한다.
		int result = 0;
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if( (ar[i]+ar[j]) % k == 0) result++;
			}
		}
		return result;
	}
	
	@Test
	public void testDivisibleSumPairs() throws Exception {
		int n = 6;
		int k = 3;
		int[] ar = new int[] {1,3,2,6,1,2};
		
		assertEquals(5, divisibleSumPairs(n, k, ar));
	}

}
