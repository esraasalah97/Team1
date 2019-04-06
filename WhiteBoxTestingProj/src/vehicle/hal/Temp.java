package vehicle.hal;

//import vehicle.app.State;

//import vechile.app.myState;


public class Temp {
	public static int validateCall=0;
	public static int temp=0;

	public static int iReadT1() {
		validateCall++;
		return temp;
	}
	
	public static int iReadT2() {
		
		return temp;
	}

}
