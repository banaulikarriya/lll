package evm;

public class EVM {
	
	
	BallotUnit ballot;
	ControlUnit control;
	int totalCandidate;
	
	
	EVM(int totalcandidate)
	{
		this.totalCandidate=totalcandidate;
		ballot =new BallotUnit(totalCandidate);
		control =new ControlUnit();
	}
	void controlUnit(int request)
		{
			if(request==0)
			{
				control.onlamp.lamp_glow();
				
				if(control.onlamp.lamp=="on")
				{
					
					control.ballotbutton.button_press();
					ballot.candidatebuttn.button_press();
					ballot.candidatelamp.lamp_glow();
					
				}
				
				
			}
		}
	

	
	
}
