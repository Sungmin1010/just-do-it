package singleton.example;

public class Printer {

	private Printer() {}
	
	private static Printer instance;
	
	//������ ����ȭ ������ �ν��Ͻ��� 2�� ������ �� �ִ� ������ ��� �ϱ� ���� synchronized Ű���� ��� -> ���� ������ �߻�
	public static synchronized Printer getInstance() {
		if(instance==null) {
			instance = new Printer();
		}
		return instance;
	}
	
	
	
}
