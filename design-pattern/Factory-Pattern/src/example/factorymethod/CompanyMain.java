package example.factorymethod;

public class CompanyMain {

	public static void main(String[] args) {
		//������ ȣ���� �ű� �Ի��ڰ� �������� �Ի� ������ ����������
		//������, �μ��� �������� �ٸ���.
		//ȣ�ڰ� �μ��� Ȯ�� ���ɼ��� �����Ƿ� ���丮 �޼��� ������ ������ �� �ִ�.
		
		Hotel jejuHotel = new JejuHotel();
		Hotel busanHotel = new BusanHotel();
		
		//����ȣ�� ����Ʈ���� �ű� �Ի���
		Employee emp = jejuHotel.joinCompany("front");
		System.out.println(emp.getEmpInfo());
		
		//�λ�ȣ�� ���������� �ű� �Ի���
		emp = busanHotel.joinCompany("f&b");
		System.out.println(emp.getEmpInfo());
	}

}
