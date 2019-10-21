package easy;
//https://www.hackerrank.com/challenges/kangaroo/problem

import static org.junit.Assert.*;
import org.junit.Test;

public class Kangaroo {
	
	static String kangaroo(int x1, int v1, int x2, int v2) {


		return "";
    }

	
	@Test
	public void testKangaroo() throws Exception {
		//given
		int x1 = 0;
		int v1 = 3;
		int x2 = 4;
		int v2 = 2;
		//when
		String result = kangaroo(x1, v1, x2, v2);
		//then
		assertEquals("yes", result);
		
	}
}
