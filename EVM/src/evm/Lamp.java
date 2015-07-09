package evm;

public abstract class Lamp {
	
	String lamp="off";

	
	
	public String getLamp() {
		return lamp;
	}



	public void setLamp(String lamp) {
		this.lamp = lamp;
	}



	public abstract void lamp_glow();
	
	

}
