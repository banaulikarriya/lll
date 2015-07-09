package evm;

public class BallotButton extends Button {

	
	@Override
	public void button_press() {
		// TODO Auto-generated method stub
		if(state==0)
		{
			state=1;
			System.out.println(" Ballot button is press");
		}
		else
		{
			state=0;
			System.out.println(" Ballot button not press");
		}
		
	}

}
