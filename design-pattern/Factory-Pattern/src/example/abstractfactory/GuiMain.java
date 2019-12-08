package example.abstractfactory;

import example.abstractfactory.abst.Button;
import example.abstractfactory.abst.GuiFactory;
import example.abstractfactory.abst.TextArea;

public class GuiMain {
	public static void main(String[] args) {
		String os = "Linux"; //Windows or Linux
		GuiFactory factory = Factory.getGuiFactory(os);
		
		Button button = factory.createButton();
		TextArea textArea = factory.createTextArea();
		
		button.click();
		textArea.typing();
	}

}
