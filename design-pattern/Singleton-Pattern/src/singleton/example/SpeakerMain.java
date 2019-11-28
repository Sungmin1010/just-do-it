package singleton.example;

public class SpeakerMain {

	public static void main(String[] args) {
		Speaker speaker1 = Speaker.getInstance();
		Speaker speaker2 = Speaker.getInstance();
		
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		speaker1.setVolume(99);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		
		//System.out.println(speaker1);
		//System.out.println(speaker2);

	}

}
