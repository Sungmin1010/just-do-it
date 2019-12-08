package example.abstractfactory.win;

import example.abstractfactory.abst.Button;

public class WinButton implements Button {

	@Override
	public void click() {
		System.out.println("윈도우 버튼 클릭!!");

	}

}
