package vehicle.app;
import vehicle.app.State;
import vehicle.hal.Temp;
public class StateChild extends State {
	
	
	public static int validateCallFailure=0;
	public static int validateCallLowP=0;
	public static int validateCallHighP=0;
	public static String Seq="";
	public static int validateCall;
	public static boolean flag1=false,flag2=true,flag3=false;
	@Override 
	public boolean bValidateFailure() {
		validateCallFailure++;
		
		Seq+='a';

		return flag1;
	}
	
	@Override 
	public boolean bValidateLowPerformance()
	{
		validateCallLowP++;
		
		Seq+='b';
		return flag2;
	}
	
	@Override 
	public boolean bValidateHighPerformance() {
		validateCallHighP++;
	
		Seq+='c';	
         Temp.iReadT1();

		 return flag3;
	}
	
	
	

}
