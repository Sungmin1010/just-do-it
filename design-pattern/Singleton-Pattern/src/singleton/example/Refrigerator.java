package singleton.example;

public class Refrigerator {
//LazyHolder Singleton Pattern
	private Refrigerator() {}
	
	public static Refrigerator getInstance() {
		return LazyHolder.INSTANCE; 
		//LazyHolder�� �ν��Ͻ��� �����ϴ� ���� Ŭ������ �ε��Ǹ� �ʱ�ȭ�� ����.
	}
	
	private static class LazyHolder{
		private static final Refrigerator INSTANCE = new Refrigerator();
	}
}
