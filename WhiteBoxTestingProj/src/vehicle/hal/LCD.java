package vehicle.hal;

public class LCD {
	
	public static int validateCall=0;
	public static int LCDState;
    public static int validateSeq;
    
    
	public static void vidOutput(int state) 
	{
		validateCall++;
		LCDState=state;
		validateSeq=1;

	}
	

}
