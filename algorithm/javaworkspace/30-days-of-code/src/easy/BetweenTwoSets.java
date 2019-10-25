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
		
		//i�� �ΰ��� Set ������ �� �϶�, �� ������ �����ϴ� �� ã�� 
		//����1 : (i+1)�� a Set ��ҵ�� ������ ����������            (i+1) % a == 0 
		//����2 : (i+1)�� b Set ��ҵ��� ������ �������� �ϴ���         b % (i+1) == 0
		
		//����1�� �����ϴ� �� result�� �ֱ�
		for(int i=a.get(aLen-1); i<=b.get(0); i++) {  //4~16
			int cnt = 0;
			for(Integer f:a) {
				if(i%f!=0) break;
				cnt++;
			}
			if(cnt==a.size()) result.add(i); 
		}
		
		//result ����Ʈ���� ����2 �����ϴ� �� ã��
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
