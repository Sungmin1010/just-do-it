package easy;

import static org.junit.Assert.*;

import org.junit.Test;

public class AppleAndOrange {

	static int[] countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

		int[] output = new int[2];  //output[0]:Apples, output[1]:Oranges
		
		for(int i=0; i<apples.length; i++) {
			apples[i] = a + apples[i];
			if(apples[i] >= s && apples[i] <= t) output[0]++;
		}
		
		for(int j=0; j<oranges.length; j++) {
			oranges[j] = b + oranges[j];
			if(oranges[j] >= s && oranges[j] <= t) output[1]++;
		}
		
		return output;
    }
	
	
	@Test
	public void testCountApplesAndOranges() throws Exception {
		//given
		int s = 7;
		int t = 11;
		int a = 5;
		int b = 15;
		int[] apples = {-2, 2, 1};
		int[] orrange = {5, -6};
		//when
		int[] output = countApplesAndOranges(s, t, a, b, apples, orrange);
		//then
		assertEquals(1, output[0]);
		assertEquals(1, output[1]);
	}
	

}
