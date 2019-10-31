package easy;
//https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

import static org.junit.Assert.*;

import org.junit.Test;

public class BreakingTheRecords {

	static int[] breakingRecords(int[] scores) {
		int highestCnt= 0;
		int lowestCnt = 0;
		//0번째 게임은 기준점수로 highestScore, lowestScore를 초기화해준다.
		int highestScore = scores[0];
		int lowestScore = scores[0];
		//1번째 게임부터 마지막 게임까지 반복한다.
		for(int i=1; i<scores.length; i++) {
			
			if(scores[i]>highestScore) {
				//i번째 점수가 highestScore보다 크면 highestScore 값을 바꾸고 highestCnt를 1증가
				highestScore = scores[i];
				highestCnt++;
			}
			if(scores[i] < lowestScore){
				//i번째 점수가 lowestScore보다 작으면 lowestScore값을 바꾸고 lowestCnt를 1증가
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
