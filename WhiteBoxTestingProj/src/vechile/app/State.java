package vechile.app;

import vechile.hal.Temp;

public class State {
	
	public static int validateseq1=0;

	public static int validateCall=0;
	public static int validateCallFailure=0;
	public static int validateCallLowP=0;
	public static int validateCallHighP=0;
	
	
	public boolean bValidateFailure() {
		validateCallFailure++;
		validateseq1++;

		return false;
	}
	public boolean bValidateLowPerformance()
	{
		validateCallLowP++;
		validateseq1++;

		return true;
	}
	
	
	public boolean bValidateHighPerformance() {
		validateCallHighP++;
		validateseq1++;
		
		 int temp_reading = Temp.iReadT1();
		/* if(temp_reading<=50) {
			 return false;
		 }
		 else {
			 return false;
		 }
		 */
		 return false;
	}
	
	public void vidGoToNextState()
	{
		
		Global.iState=1;
	
	}
	

}
