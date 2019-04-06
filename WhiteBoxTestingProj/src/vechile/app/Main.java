package vechile.app;

import vechile.hal.LCD;
import vechile.hal.Motor;

public class Main {
	
	public static void vidInit()
	{
		Global.iState=0;
		LCD.vidOutput(Global.iState);
		Motor.vidOutput(Global.iState);



	}
	

}
