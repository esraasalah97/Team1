package vehicle.app;

import vehicle.hal.LCD;
import vehicle.hal.Motor;

public class myMain {
	
	public static void vidInit()
	{
		Global.iState=0;
		LCD.vidOutput(Global.iState);
		Motor.vidOutput(Global.iState);

	}
	

}
