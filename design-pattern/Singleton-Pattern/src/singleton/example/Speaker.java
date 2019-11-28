package singleton.example;

public class Speaker {
	private static Speaker instance;
	private int volume;
	
	private Speaker() {
		volume = 0;
	}
	public static Speaker getInstance() {
		if(instance == null) {
			instance = new Speaker();
		}
		return instance;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
	

}
