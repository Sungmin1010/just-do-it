package easy;
//https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class BreakingTheRecords {

	static int[] breakingRecords(int[] scores) {
		int highestCnt= 0;
		int lowestCnt = 0;
		//0��° ������ ���������� highestScore, lowestScore�� �ʱ�ȭ���ش�.
		int highestScore = scores[0];
		int lowestScore = scores[0];
		//1��° ���Ӻ��� ������ ���ӱ��� �ݺ��Ѵ�.
		for(int i=1; i<scores.length; i++) {
			
			if(scores[i]>highestScore) {
				//i��° ������ highestScore���� ũ�� highestScore ���� �ٲٰ� highestCnt�� 1����
				highestScore = scores[i];
				highestCnt++;
			}
			if(scores[i] < lowestScore){
				//i��° ������ lowestScore���� ������ lowestScore���� �ٲٰ� lowestCnt�� 1����
				lowestScore = scores[i];
				lowestCnt++;
			}
			
		}
		
		int[] result = {highestCnt, lowestCnt};
		return result;
	}
	
	//�׽�Ʈ ȯ��
	//�Ķ���� ���� �޼ҵ�
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{new int[] {10,5,20,20,4,5,2,25,1}, new int[] {2,4}},
			{new int[] {3, 4, 21, 36, 10, 28, 35, 5, 24, 42}, new int[] {4,0}}
		});
	}
	
	//data() �� �׸��� ù��° ����
	@Parameter(0)
	public int[] scores;
	
	@Parameter(1)
	public int[] result;
	
	
	@Test
	public void testBreakingRecords() throws Exception {
		//int[] scores = {10,5,20,20,4,5,2,25,1};
		//int[] result = breakingRecords(scores);
		
		assertArrayEquals(result, breakingRecords(scores));
	}
}
