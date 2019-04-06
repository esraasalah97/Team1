package vechile.hal;

public class Motor {
	public static int validateCall=0;
    public static int motorState;
	
	public static void vidOutput(int state) 
	{
		validateCall++;
		motorState=state;
		LCD.validateSeq=2;
	}

}
