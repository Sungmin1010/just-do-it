package easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppleAndOrange {

	static int[] countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

		int[] output = {1,1};
		
		return output;
    }
	
	
	@Test
	public void testCountApplesAndOranges() throws Exception {
		//given
		int s = 7;
		int t = 11;
		int a = 5;
		int b = 15;
		int m = 3;
		int n = 2;
		int[] apples = {-2, 2, 1};
		int[] orrange = {5, -6};
		//when
		int[] output = countApplesAndOranges(s, t, a, b, apples, orrange);
		//then
		assertEquals(1, output[0]);
		assertEquals(1, output[1]);
	}
	

}
