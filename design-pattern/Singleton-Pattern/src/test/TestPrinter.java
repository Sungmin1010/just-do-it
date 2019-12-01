package test;

import static org.junit.Assert.*;

import org.junit.Test;

import singleton.example.Printer;

public class TestPrinter {
	
	@Test
	public void testPrinter() throws Exception {
		Printer printer1 = Printer.getInstance();
		Printer printer2 = Printer.getInstance();
		
		//두 객체가 동일한 객체인지 주소값을 비교하는 단정문 assertSame
		assertSame(printer1, printer2);
	}

}
