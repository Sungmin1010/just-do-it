package easy;

import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.List;
import org.junit.Test;

//https://www.hackerrank.com/challenges/the-birthday-bar/problem
public class BirthdayChocolate {

	static int birthday(List<Integer> s, int d, int m) {
		
		return 0;
    }
	
	@Test
	public void testBirthday() throws Exception {
		//given
		List<Integer> s = Arrays.asList(1, 2, 1, 3, 2);
		int d = 3;
		int m = 2;
		//when
		int result = birthday(s, d, m);
		//then
		assertEquals(2, result);
	}
}
