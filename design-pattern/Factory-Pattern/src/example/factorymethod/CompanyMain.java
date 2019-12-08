package example.factorymethod;

public class CompanyMain {

	public static void main(String[] args) {
		//지역별 호텔의 신규 입사자가 생겼을때 입사 절차는 동일하지만
		//지역별, 부서별 유니폼이 다르다.
		//호텔과 부서의 확장 가능성이 높으므로 팩토리 메서드 패턴을 적용할 수 있다.
		
		Hotel jejuHotel = new JejuHotel();
		Hotel busanHotel = new BusanHotel();
		
		//제주호텔 프론트팀에 신규 입사자
		Employee emp = jejuHotel.joinCompany("front");
		System.out.println(emp.getEmpInfo());
		
		//부산호텔 객실팀에서 신규 입사자
		emp = busanHotel.joinCompany("f&b");
		System.out.println(emp.getEmpInfo());
	}

}
