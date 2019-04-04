package vehicle.app;

import vehicle.hal.Temp;

public class State {
	
	public static int validateseq;
	public static int validateCall;
	public static int validateCallFailure=0;
	public static int validateCallLowP=0;
	public static int validateCallHighP=0;
	
	
	public boolean bValidateFailure() {
		validateCallFailure++;
		validateseq=1;
		return true;
	}
	public boolean bValidateLowPerformance()
	{
		validateCallLowP++;
		validateseq=2;
		return false;
	}
	
	
	public boolean bValidateHighPerformance() {
		validateCallHighP++;
		validateseq=3;
		
		 int temp_reading = Temp.iReadT1();
		 if(temp_reading<=50) {
			 return false;
		 }
		 else {
			 return false;
		 }
	}
	public void vidGoToNextState()
	{
		Global.iState=1;
	
	}
	

}
