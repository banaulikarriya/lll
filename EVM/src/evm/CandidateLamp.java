package evm;

public class CandidateLamp extends Lamp {

	@Override
	public void lamp_glow() {
		if(lamp =="off")
		{
			lamp ="on";
			System.out.println("candidate lamp is on");
		}
		else
		{
			lamp ="off";
			System.out.println("candidate lamp is off");
		}
	}

}
