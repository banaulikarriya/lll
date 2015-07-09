package evm;

public class CandidateLamp extends Lamp {

	@Override
	public void lamp_glow() {
		if(lamp =="off")
		{
			lamp ="on";
			System.out.println("lamp is on");
		}
		else
		{
			lamp ="off";
			System.out.println("lamp is off");
		}
	}

}
