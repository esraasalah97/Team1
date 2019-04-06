package vehicle.app;

import vehicle.hal.Temp;

public class myState {
	
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
         Temp.iReadT1();

		 return false;
	}
	
	public void vidGoToNextState()
	{
		bValidateFailure();
		bValidateLowPerformance();
		bValidateHighPerformance();
		Global.iState=1;
	
	}
	

}
