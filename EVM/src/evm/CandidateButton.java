package evm;

public class CandidateButton extends Button {

	@Override
	public void button_press() {
		// TODO Auto-generated method stub
		if(state==0)
		{
			state=1;
			System.out.println("candidate button is press");
		}
		else
		{
			state=0;
			System.out.println("candidate button not press");
		}
		
	}

}
