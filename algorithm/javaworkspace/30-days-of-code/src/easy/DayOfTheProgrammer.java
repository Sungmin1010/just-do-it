package easy;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

//https://www.hackerrank.com/challenges/day-of-the-programmer/problem

@RunWith(Parameterized.class)
public class DayOfTheProgrammer {
	
	static String dayOfProgrammer(int year) {
		
		return "13.09.2017";
    }
	
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object[][] {
			{2017, "13.09.2017"},
			{2016, "12.09.2016"},
			{2018, "12.09.1800"}
		});
	}
	
	@Parameter(0)
	public int year;
	
	@Parameter(1)
	public String result;
	
	@Test
	public void testDayOfProgrammer() throws Exception {
		assertEquals(result, dayOfProgrammer(year));
	}

}
