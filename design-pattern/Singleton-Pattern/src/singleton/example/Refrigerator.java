package singleton.example;

public class Refrigerator {
//LazyHolder Singleton Pattern
	private Refrigerator() {}
	
	public static Refrigerator getInstance() {
		return LazyHolder.INSTANCE; 
		//LazyHolder의 인스턴스를 참조하는 순간 클래스가 로딩되며 초기화가 진행.
	}
	
	private static class LazyHolder{
		private static final Refrigerator INSTANCE = new Refrigerator();
	}
}
