package easy;
//https://www.hackerrank.com/challenges/migratory-birds/problem
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class MigratoryBirds {
	//arr 횟수가 가장 많이 나온 새의 id number, 두개 또는 그 이상이 같다면 id number가 제일 작은 값 
	static int migratoryBirds(List<Integer> arr) {
		//새의 종류는 1, 2, 3, 4, 5 => 5가지
		//5 <= n <= 2*10^5
		
		//step1: arr을 순회하면서 새 id 값의 마리수를 가진 배열을 만든다.
		//step2: 1번부터 5번까지 새의 마리수가 적힌 배열에서 가장 큰 값을 찾는다.(만약 두개 이상의 값다면 id number가장 작은 새)
		
		int[] birds = countBirds(arr);
		int birdId = findMostCommonBirds(birds);
		
		return birdId;
		
    }
	
	private static int findMostCommonBirds(int[] birds) {
		int max = -1;
		int birdId = 0;
		for(int i=birds.length-1; i>=0; i--) {
			if(birds[i] >= max) {
				max = birds[i];
				birdId = i+1;
			}
		}
		return birdId;
	}

	private static int[] countBirds(List<Integer> arr) {
		int[] birds = new int[5];
		for(Integer i:arr) {
			birds[i-1]++;
		}
		return birds;
	}

	//----- Test Code ------
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{Arrays.asList(new Integer[] {1, 4, 4, 4, 5, 3}), 4},
			{Arrays.asList(new Integer[] {1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4}), 3}
			
		});
	}
	
	@Parameter(0)
	public List<Integer> arr;
	
	@Parameter(1)
	public int result;
	
	@Test
	public void testMigratoryBirds() throws Exception {
		assertEquals(result, migratoryBirds(arr));
	}

}
