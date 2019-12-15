package protection;

public class RealKPI implements Ikpi{

	@Override
	public String accessToTheKPIpage(String name) {
		
		String message ="Hi~! "+name+ 
				", Welcome to Our KPI page";
		return message;
	}

}
