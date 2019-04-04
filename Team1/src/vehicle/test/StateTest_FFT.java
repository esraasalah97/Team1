package vehicle.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import vehicle.app.Global;
import vehicle.app.state;

public class StateTest_FFT {
	@Test
	public void StateTestCase4()
	{ state s=new state();
		boolean bVF=s.bValidateFailure();
		boolean bVHP=s.bValidateHighPerformance();
		boolean bVLP=s.bValidateLowPerformance();
		
		s. vidGoToNextState();
	    assertAll(
		    ()->	assertFalse(bVF),
		    ()->	assertFalse(bVHP),
		    ()->	assertTrue(bVLP),
		    () -> assertEquals(2,s.validateSeq),
		    () -> assertEquals(1,s.validateCall1),
		    ()->   assertEquals(1,Global.iState));
	    }
	   
}

