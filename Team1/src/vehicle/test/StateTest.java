
package vehicle.test;
import vehicle.app.State;

public class StateTest {
	State s=new State();

	public void StateTestCase1()
	{
		boolean bVF=s.bValidateFailure();
		boolean bVHP=s.bValidateHighPerformance();
		boolean bVLP=s.bValidateLowPerformance();
		if( bVF==false && bVHP==false && bVLP==false )
		{
	    s. vidGoToNextState();
	    assertEquals(3,Global.iState);
		}

		 }
