package singleton.example;

public class Printer {

	private Printer() {}
	
	private static Printer instance;
	
	//쓰레드 동기화 문제로 인스턴스가 2개 생성될 수 있는 문제를 방기 하기 위해 synchronized 키워드 사용 -> 성능 문제가 발생
	public static synchronized Printer getInstance() {
		if(instance==null) {
			instance = new Printer();
		}
		return instance;
	}
	
	
	
}
