package easy;
//https://www.hackerrank.com/challenges/kangaroo/problem

import static org.junit.Assert.*;
import org.junit.Test;

public class Kangaroo {
	
	static String kangaroo(int x1, int v1, int x2, int v2) {

		int i=0;
		
		if(v1>v2) {
			while(true) {
				if( i*v1+x1>10000 || i*v2+x2>10000 ) break;
				if( i*v1+x1 == i*v2+x2 ) return "YES";
				i++;
			}
		}

		return "NO";
    }

	
	@Test
	public void testKangarooYes() throws Exception {
		//given
		int x1 = 0;
		int v1 = 3;
		int x2 = 4;
		int v2 = 2;
		//when
		String result = kangaroo(x1, v1, x2, v2);
		//then
		assertEquals("YES", result);
		
	}
	
	@Test
	public void testKangarooNo() throws Exception {
		//given
		int x1 = 0;
		int v1 = 2;
		int x2 = 5;
		int v2 = 4;
		//when
		String result = kangaroo(x1, v1, x2, v2);
		//then
		assertEquals("NO", result);
	}
}
