import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vehicle.app.Global;
import vehicle.app.State;



public class StateTest {
	
	@Test
	public void StateTestCase1()
	{ //no_testcase
		boolean bVF=s.bValidateFailure();
		boolean bVHP=s.bValidateHighPerformance();
		boolean bVLP=s.bValidateLowPerformance();
		if( bVF==false && bVHP==true && bVLP==false )
		{
	    s. vidGoToNextState();
	    assertEquals(2,Global.iState);
		}
}
