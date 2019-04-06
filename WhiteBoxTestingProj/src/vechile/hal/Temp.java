package vechile.hal;

import vechile.app.State;

public class Temp {
	
	public static int iReadT1() {
		int temp=60;
		State.validateCall++;
		return temp;
	}
	
	public static int iReadT2() {
		int temp=0;
		
		return temp;
	}

}
