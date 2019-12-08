package example.abstractfactory.win;

import example.abstractfactory.abst.Button;
import example.abstractfactory.abst.GuiFactory;
import example.abstractfactory.abst.TextArea;

public class WinGuiFactory implements GuiFactory{

	@Override
	public Button createButton() {
		return new WinButton();
	}

	@Override
	public TextArea createTextArea() {
		return new WinTextArea();
	}

}
