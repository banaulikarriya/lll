package evm;

import java.util.ArrayList;

public class EVM {
	
	
	BallotUnit ballot;
	ControlUnit control;
	int totalCandidate;
	Candidate candidates;
	
	
	

	
	EVM(int totalcandidate)
	{
		
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
					if(ballot.candidatebuttn.state==0)
					{
					
					ballot.candidatelamp.lamp_glow(); 
					Candidate c1=new Candidate(1);
					
					Candidate c2=new Candidate(2);
					Candidate c3=new Candidate(3);
				 
					 c1.voteforme();
					 c2.voteforme();
					 c3.voteforme();
					 c2.voteforme();
					
					
					
					}
				}
				
				
			}
			
			
		}
	
     
	
	
}
