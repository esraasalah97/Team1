package vehicle.test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import vehicle.app.Global;
import vehicle.app.State;

public class StateTestNoCase {
	State s = new State();
	@Test
	public void StateTestCase1()
	{ //no_testcase
		
		boolean bVF= s.bValidateFailure();
		boolean bVHP= s.bValidateHighPerformance();
		boolean bVLP= s.bValidateLowPerformance();
		assertAll{
		assertFalse(bVF), 
		assertFalse(bVHP), 
	        assertFalse(bVLP)
		};
	    s.vidGoToNextState();
	    assertEquals(3,Global.iState);
		

	}
}
