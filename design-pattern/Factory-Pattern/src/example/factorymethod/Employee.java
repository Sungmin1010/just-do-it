package example.factorymethod;

public abstract class Employee {
	String dept;
	String uniform;
	String corp;
	
	void prepare() {
		System.out.println("... �Ի� �غ���");
	}
	
	void introduceOneSelf() {
		System.out.println("�ȳ��ϼ���. "+this.corp+"/"+this.dept+"�� �Ի��߽��ϴ�. �ߺ�Ź�帳�ϴ�.^^");
	}
	
	void fillOutPersonnelCard() {
		System.out.println("... �λ�ī�� �ۼ�");
	}
	
	void receiveUniform() {
		System.out.println("... ������ ���� - "+uniform);
	}

	public String getEmpInfo() {
		return "Employee [dept=" + dept + ", uniform=" + uniform + ", corp=" + corp + "]";
	}

	
}
