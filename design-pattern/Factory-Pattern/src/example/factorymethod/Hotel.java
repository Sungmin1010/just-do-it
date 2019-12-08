package example.factorymethod;

public abstract class Hotel {
	
	public Employee joinCompany(String dept) {
		Employee emp = createEmp(dept);
		
		emp.prepare();
		emp.fillOutPersonnelCard();
		emp.receiveUniform();
		emp.introduceOneSelf();
		
		return emp;
	}
	
	protected abstract Employee createEmp(String dept);

}
