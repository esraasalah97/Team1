package vehicle.app;

import vehicle.hal.Temp;

public class State {
	public static int validateCall1 = 0 ;
	public static int validateCall2= 0 ;
	public static int validateCall3 = 0 ;
	public static int validateseq;
	
	
	public boolean bValidateFailure() {
		validateCall3++;
		validateseq=1;
		return false;
	}
	public boolean bValidateLowPerformance()
	{
		validateCall1++;
		validateseq=2;
		return false;
	}
	
	
	public boolean bValidateHighPerformance() {
		validateCall2++;
		validateseq=3;
		
		 int temp_reading = Temp.iReadT1();
		 if(temp_reading<=50) {
			 return true;
		 }
		 else {
			 return false;
		 }
	}
	public void vidGoToNextState()
	{
		Global.iState=4;
	
	}
	

}
