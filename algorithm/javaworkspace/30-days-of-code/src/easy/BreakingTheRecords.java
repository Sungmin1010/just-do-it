package easy;
//https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

import static org.junit.Assert.*;

import org.junit.Test;

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
	
	@Test
	public void testBreakingRecords() throws Exception {
		int[] scores = {10,5,20,20,4,5,2,25,1};
		int[] result = breakingRecords(scores);
		
		assertArrayEquals(new int[] {2,4}, result);
	}
}
