package example.abstractfactory;

import example.abstractfactory.abst.GuiFactory;
import example.abstractfactory.linux.LinuxGuiFactory;
import example.abstractfactory.win.WinGuiFactory;

public class Factory {
	public static GuiFactory getGuiFactory(String os) {
		if(os.equals("Windows")) {
			return new WinGuiFactory();
		}else if(os.equals("Linux")) {
			return new LinuxGuiFactory();
		}else return null;
	}
	
}
