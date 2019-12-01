package test;

import static org.junit.Assert.*;

import org.junit.Test;

import singleton.example.Printer;

public class TestPrinter {
	
	@Test
	public void testPrinter() throws Exception {
		Printer printer1 = Printer.getInstance();
		Printer printer2 = Printer.getInstance();
		
		//�� ��ü�� ������ ��ü���� �ּҰ��� ���ϴ� ������ assertSame
		assertSame(printer1, printer2);
	}

}
