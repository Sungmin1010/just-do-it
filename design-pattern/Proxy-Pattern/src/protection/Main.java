package protection;

public class Main {

	public static void main(String[] args) {
		// ���������������� �� �� �ִ� ����� �� ����� ���δ�.
		// �׽�Ʈ �ڵ�� ��ȯ(test.protection.ProtectionTest.java)
		Ikpi kpi = new ProxyKPI();
		//String message = kpi.accessToTheKPIpage("lim");
		String message = kpi.accessToTheKPIpage("Sam");

		System.out.println(message);
	}

}
