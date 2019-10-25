package easy;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

//https://www.hackerrank.com/challenges/between-two-sets/problem
public class BetweenTwoSets {

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		List<Integer> result = new ArrayList<>();
		int aLen = a.size();
		int bLen = b.size();
		int res = 0;
		
		//i가 두개의 Set 사이의 수 일때, 두 조건을 만족하는 값 찾기 
		//조건1 : (i+1)가 a Set 요소들로 나누어 떨어지는지            (i+1) % a == 0 
		//조건2 : (i+1)가 b Set 요소들을 나누어 떨어지게 하는지         b % (i+1) == 0
		
		//조건1에 만족하는 값 result에 넣기
		for(int i=a.get(aLen-1); i<=b.get(0); i++) {  //4~16
			int cnt = 0;
			for(Integer f:a) {
				if(i%f!=0) break;
				cnt++;
			}
			if(cnt==a.size()) result.add(i); 
		}
		
		//result 리스트에서 조건2 만족하는 값 찾기
		for(Integer r:result) {
			int cnt = 0;
			for(Integer f:b) {
				if(f%r != 0) break;
				cnt++;
			}
			if(cnt==b.size()) res++;
		}
		return res;
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
	
	@Test
	public void testGetTotalXFunction2() throws Exception {
		//given
		List<Integer> a = new ArrayList<>();
		a.add(3);
		a.add(4);
		List<Integer> b = new ArrayList<>();
		b.add(24);
		b.add(48);
		//when
		int result = getTotalX(a, b);
		//then
		assertEquals(2, result);
	}
	
	@Test
	public void testGetTotalXFunction3() throws Exception {
		//given
		List<Integer> a = new ArrayList<>();
		a.add(1);
		List<Integer> b = new ArrayList<>();
		b.add(100);
		//when
		int result = getTotalX(a, b);
		//then
		assertEquals(9, result);
	}
}
