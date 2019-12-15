package protection;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProtectionTest {

	
	@Test
	public void testKPIPageAccessDenied() throws Exception {
				Ikpi kpi = new ProxyKPI();
				String message = kpi.accessToTheKPIpage("lim");
				assertEquals("Access Denied", message);

	}
	
	@Test
	public void testKPIPageAccessAccept() throws Exception {
				Ikpi kpi = new ProxyKPI();
				String message = kpi.accessToTheKPIpage("Sam");
				assertNotEquals("Access Denied", message);

	}
}
