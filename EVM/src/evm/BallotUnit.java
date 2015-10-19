package evm;

public class BallotUnit {
	
	ReadyLamp ready;
	Button candidatebutton;
	Lamp candidatelamp;
	Button candidatebuttn;
	Candidate candidate;
	TotalButton TotalButton;
	int totalCandidate;
	int candidateid;
	
	
	BallotUnit(int totalCandidate)
	{
		this.totalCandidate=totalCandidate;
		candidatebutton =new CandidateButton();
		candidatelamp =new CandidateLamp();
		candidatebuttn =new  CandidateButton();
		candidate =new Candidate(candidateid);
		TotalButton=new TotalButton();
	}
	
	
	
	
	
	

}
