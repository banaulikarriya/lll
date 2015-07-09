package evm;

public class ReadyLamp extends Lamp{

	@Override
	public void lamp_glow() {
		// TODO Auto-generated method stub
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
