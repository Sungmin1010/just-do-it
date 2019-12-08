package example.abstractfactory.linux;

import example.abstractfactory.abst.Button;
import example.abstractfactory.abst.GuiFactory;
import example.abstractfactory.abst.TextArea;

public class LinuxGuiFactory implements GuiFactory{

	@Override
	public Button createButton() {
		return new LinuxButton();
	}

	@Override
	public TextArea createTextArea() {
		return new LinuxTextArea();
	}

}
