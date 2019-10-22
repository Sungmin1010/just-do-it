package easy;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

//https://www.hackerrank.com/challenges/between-two-sets/problem
public class BetweenTwoSets {
	public static int getTotalX(List<Integer> a, List<Integer> b) {
		return 0;
	}

	
	@Test
	public void testGetTotalXFunction() throws Exception {
		//given
		List<Integer> a = new ArrayList<>();
		a.add(2);
		a.add(4);
		List<Integer> b = new ArrayList<>();
		b.add(16);
		b.add(32);
		b.add(96);
		//when
		int result = getTotalX(a, b);
		//then
		assertEquals(3, result);
	}
}
