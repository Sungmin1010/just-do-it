package protection;

import java.util.ArrayList;
import java.util.List;

public class ProxyKPI implements Ikpi{
	
	private RealKPI realKPI = new  RealKPI();
	private List<String> kpiList = new ArrayList<>();
	
	ProxyKPI(){
		kpiList.add("Sam");
		kpiList.add("Kim");
	}

	@Override
	public String accessToTheKPIpage(String name) {
		if(this.kpiList.contains(name)) {
			return realKPI.accessToTheKPIpage(name);
		}
		return "Access Denied";
	}

}
