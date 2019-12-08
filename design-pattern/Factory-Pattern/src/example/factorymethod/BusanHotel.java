package example.factorymethod;

public class BusanHotel extends Hotel{

	@Override
	protected Employee createEmp(String dept) {
		if(dept.equals("front")) {
			return new BusanFrontTeamEmp();
		}else if(dept.equals("f&b")) {
			return new BusanFandBTeamEmp();
		}
		return null;
	}

}
