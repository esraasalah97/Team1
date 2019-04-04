
package vehicle.hal;

import vehicle.app.State;

public class Temp {
	
	public static int iReadT1() {
		int temp=45;
		State.validateCall++;
		return temp;
	}
	
	public static int iReadT2() {
		int temp=0;
		
		return temp;
	}

}
