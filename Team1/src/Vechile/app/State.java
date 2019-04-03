package Vechile.app;

import Vechile.hal.Temp;

public class State {
	public static int validateCall = 0 ;
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
