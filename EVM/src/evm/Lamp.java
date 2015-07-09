package evm;

public abstract class Lamp {
	
	Integer State;

	public Integer getState() {
		return State;
	}

	public void setState(Integer state) {
		State = state;
	}
	
	public abstract void lamp_glow();
	
	

}
