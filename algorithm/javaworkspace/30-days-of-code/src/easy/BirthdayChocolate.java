package easy;

import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.List;
import org.junit.Test;

//https://www.hackerrank.com/challenges/the-birthday-bar/problem
public class BirthdayChocolate {
	

	static int birthday(List<Integer> s, int d, int m) {
		//리스트 s를 배열로 만들어서 해결
		int result = 0;
		Integer[] arrayS = s.toArray(new Integer[]{0});
		//배열의 0부터 (길이-m)까지 포문을 돌면서
		for(int i=0; i<=arrayS.length-m; i++) {
			//i부터 i+m-1 까지 모두 더한 값이 d 가 되는지 확인
			int sum = sumSubArray(arrayS, i, m);
			if(sum==d) result++;
		}
		return result;
		  
    }
	
	static int sumSubArray(Integer[] arr,int startIndx,int m) {
		int totalSum = 0;
		
		for(int i=startIndx; i<startIndx+m; i++) {
			totalSum += arr[i];
		}
		return totalSum;
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
