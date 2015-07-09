package evm;

public class ControlUnit {
	Lamp onlamp;
	Lamp busyLamp;
	TotalButton Totalbutton;
	BallotButton ballotbutton;
	
	ControlUnit()
	{
		onlamp =new ReadyLamp();
		busyLamp =new BusyLamp();
		Totalbutton =new TotalButton();
		ballotbutton= new BallotButton();
	}
	
	
	

}
