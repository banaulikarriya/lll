package evm;

public class Candidate {
	int candidate_id;
	int poll=0;
	int totalCount;
	
	
	Candidate(int candidate_id)
	{
		this.candidate_id=candidate_id;
		
		
	}

	public int getPoll() {
		return poll;
	}

	public void setPoll(int poll) {
		this.poll = poll;
	}

	public int getCandidate_id() {
		return candidate_id;
	}

	public void setCandidate_id(int candidate_id) {
		this.candidate_id = candidate_id;
	}
	
	void voteforme()
	{
		
		poll=poll+1;
		totalCount=totalCount+1;
		System.out.println("vote "+poll+" Candidate id is "+this.getCandidate_id());
		
	}
	 
	

}
