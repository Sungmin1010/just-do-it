package example.abstractfactory.win;

import example.abstractfactory.abst.TextArea;

public class WinTextArea implements TextArea {

	@Override
	public void typing() {

		System.out.println("윈도우 텍스트영역 타이핑");
	}

}
