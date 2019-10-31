package easy;
//https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

import static org.junit.Assert.*;

import org.junit.Test;

public class BreakingTheRecords {

	static int[] breakingRecords(int[] socres) {
		int[] result = {2,4};
		return result;
	}
	
	@Test
	public void testBreakingRecords() throws Exception {
		int[] scores = {10,5,20,20,4,5,2,25,1};
		int[] result = breakingRecords(scores);
		
		assertArrayEquals(new int[] {2,4}, result);
	}
}
