package test;

import static org.junit.Assert.*;

import org.junit.Test;

import singleton.example.Refrigerator;

public class TestRefrigerator {

	@Test
	public void testRefrigerator() throws Exception {
		Refrigerator refrigerator1 = Refrigerator.getInstance();
		Refrigerator refrigerator2 = Refrigerator.getInstance();
		
		assertSame(refrigerator1, refrigerator2);
	}
}
