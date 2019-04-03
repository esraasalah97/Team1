package vehicle.app;

import vehicle.hal.Temp;

public class State {
	public static int validateCall = 0 ;
	public boolean bValidateLowPerformance()
	{}
	public void vidGoToNextState()
	{}
	public boolean bValidateHighPerformance() {
		
		 int temp_reading = Temp.iReadT1();
		 if(temp_reading<=50) {
			 return true;
		 }
		 else {
			 return false;
		 }
	}

}
