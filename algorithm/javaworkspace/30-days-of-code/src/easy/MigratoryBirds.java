package easy;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

//https://www.hackerrank.com/challenges/migratory-birds/problem
@RunWith(Parameterized.class)
public class MigratoryBirds {
	//arr Ƚ���� ���� ���� ���� ���� id number, �ΰ� �Ǵ� �� �̻��� ���ٸ� id number�� ���� ���� �� 
	static int migratoryBirds(List<Integer> arr) {
		//���� ������ 1, 2, 3, 4, 5 => 5����
		//5 <= n <= 2*10^5
		
		return 0;
		
    }
	
	
	
	
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
