package example.abstractfactory.linux;

import example.abstractfactory.abst.TextArea;

public class LinuxTextArea implements TextArea {

	@Override
	public void typing() {
		System.out.println("리눅스 텍스트영역 타이핑");

	}

}
