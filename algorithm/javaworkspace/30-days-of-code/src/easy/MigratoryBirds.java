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
	//arr Ƚ���� ���� ���� ���� ���� id number, �ΰ� �Ǵ� �� �̻��� ���ٸ� id number�� ���� ���� �� 
	static int migratoryBirds(List<Integer> arr) {
		//���� ������ 1, 2, 3, 4, 5 => 5����
		//5 <= n <= 2*10^5
		
		//step1: arr�� ��ȸ�ϸ鼭 �� id ���� �������� ���� �迭�� �����.
		//step2: 1������ 5������ ���� �������� ���� �迭���� ���� ū ���� ã�´�.(���� �ΰ� �̻��� ���ٸ� id number���� ���� ��)
		
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
