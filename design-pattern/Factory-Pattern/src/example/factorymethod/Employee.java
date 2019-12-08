package example.factorymethod;

public abstract class Employee {
	String dept;
	String uniform;
	String corp;
	
	void prepare() {
		System.out.println("... 입사 준비중");
	}
	
	void introduceOneSelf() {
		System.out.println("안녕하세요. "+this.corp+"/"+this.dept+"에 입사했습니다. 잘부탁드립니다.^^");
	}
	
	void fillOutPersonnelCard() {
		System.out.println("... 인사카드 작성");
	}
	
	void receiveUniform() {
		System.out.println("... 유니폼 수령 - "+uniform);
	}

	public String getEmpInfo() {
		return "Employee [dept=" + dept + ", uniform=" + uniform + ", corp=" + corp + "]";
	}

	
}
