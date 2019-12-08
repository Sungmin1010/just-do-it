package example.factorymethod;

public class JejuHotel extends Hotel {

	@Override
	protected Employee createEmp(String dept) {
		if(dept.equals("front")) {
			return new JejuFrontTeamEmp();
		}else if(dept.equals("room")) {
			return new JejuRoomTeamEmp();
		}else 
		return null;
	}


	

	

}
