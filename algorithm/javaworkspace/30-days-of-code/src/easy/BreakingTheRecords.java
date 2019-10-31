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
	
	//테스트 환경
	//파라미터 제공 메소드
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{new int[] {10,5,20,20,4,5,2,25,1}, new int[] {2,4}},
			{new int[] {3, 4, 21, 36, 10, 28, 35, 5, 24, 42}, new int[] {4,0}}
		});
	}
	
	//data() 항 항목의 첫번째 인자
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
