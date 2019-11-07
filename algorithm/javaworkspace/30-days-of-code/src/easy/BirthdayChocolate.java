package easy;

import static org.junit.Assert.*;


import java.util.Arrays;
import java.util.List;
import org.junit.Test;

//https://www.hackerrank.com/challenges/the-birthday-bar/problem
public class BirthdayChocolate {
	

	static int birthday(List<Integer> s, int d, int m) {
		//����Ʈ s�� �迭�� ���� �ذ�
		int result = 0;
		Integer[] arrayS = s.toArray(new Integer[]{0});
		//�迭�� 0���� (����-m)���� ������ ���鼭
		for(int i=0; i<=arrayS.length-m; i++) {
			//i���� i+m-1 ���� ��� ���� ���� d �� �Ǵ��� Ȯ��
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
