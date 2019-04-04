package vehicle.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import vehicle.app.Global;
import vehicle.app.State;
import vehicle.hal.LCD;


public class StateTest_TFF {

	@Test
		public void StateTestCase3()
			{  State s=new State();
				boolean bVF=s.bValidateFailure();//seq=1, call=1
				boolean bVHP=s.bValidateHighPerformance();//3 2 
				boolean bVLP=s.bValidateLowPerformance();//2 3 
			
			    s. vidGoToNextState();
			    assertAll(
			    ()->	assertTrue(bVF),
			    ()->	assertFalse(bVHP),
			    ()->	assertFalse(bVLP),
			   () -> assertEquals(2,State.validateseq),
			   //?????
			    () -> assertEquals(3,State.validateCallFailure),
			    ()->	assertEquals(4,Global.iState)
			    );
			}    
		
}


