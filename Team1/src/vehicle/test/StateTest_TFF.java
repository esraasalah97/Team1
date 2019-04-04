package vehicle.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import vehicle.app.Global;
import vehicle.app.state;
import vehicle.hal.LCD;


public class StateTest_TFF {

	@Test
		public void StateTestCase3()
			{  state s=new state();
				boolean bVF=s.bValidateFailure();
				boolean bVHP=s.bValidateHighPerformance();
				boolean bVLP=s.bValidateLowPerformance();
			
			    s. vidGoToNextState();
			    assertAll(
			    ()->	assertTrue(bVF),
			    ()->	assertFalse(bVHP),
			    ()->	assertFalse(bVLP),
			   () -> assertEquals(1,s.validateSeq),
			   //?????
			    () -> assertEquals(1,s.validateCall3),
			    ()->	assertEquals(4,Global.iState)
			    );
			}    
		
}


