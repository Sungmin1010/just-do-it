package protection;

public class Main {

	public static void main(String[] args) {
		// 성과관리페이지에 들어갈 수 있는 사원은 평가 대상자 뿐인다.
		// 테스트 코드로 변환(test.protection.ProtectionTest.java)
		Ikpi kpi = new ProxyKPI();
		//String message = kpi.accessToTheKPIpage("lim");
		String message = kpi.accessToTheKPIpage("Sam");

		System.out.println(message);
	}

}
