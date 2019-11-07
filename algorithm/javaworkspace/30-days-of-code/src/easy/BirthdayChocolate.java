package easy;

import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.List;
import org.junit.Test;

//https://www.hackerrank.com/challenges/the-birthday-bar/problem
public class BirthdayChocolate {
	//배열로 푸는방법 : birthday1
	//리스트로 푸는방법 : birthday2

	static int birthday(List<Integer> s, int d, int m) {
		//리스트 s를 배열로 변환 - List의 toArray 함수 사용
		int result = 0;
		Integer[] arrayS = s.toArray(new Integer[]{0});
		//배열의 0부터 (길이-m)까지 포문을 돌면서
		for(int i=0; i<=arrayS.length-m; i++) {
			//i부터 (i+m-1) 까지 모두 더한 값이 d 가 되는지 확인
			int sum = sumSubArray(arrayS, i, m);
			if(sum==d) result++;
		}
		return result;
		  
    }
	
	static int birthday2(List<Integer> s, int d, int m) {
		int result = 0;
		for(int i=0; i<=s.size()-m; i++) {
			//i부터 i+1, i+2, ..., i+m 이전까지 정수를 모두 더하기
			int sum = sumList(s.subList(i, i+m));
			if(sum==d) result++;
		}
		return result;
		  
    }
	
	static int sumList(List<Integer> list) {
		int sum = 0;
		for(Integer i:list) {
			sum += i;
		}
		return sum;
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
		int result2 = birthday2(s, d, m);
		//then
		assertEquals(2, result);
		assertEquals(2, result2);
	}
}
