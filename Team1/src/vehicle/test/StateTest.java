package vehicle.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.jupiter.api.Test;
import vehicle.app.Global;
import vehicle.app.State;


public class StateTest {
	State s=new State();
	@Test
	public void StateTestCase1()
	{ //no->no->yes
		boolean bVF=s.bValidateFailure();
		boolean bVHP=s.bValidateHighPerformance();
		boolean bVLP=s.bValidateLowPerformance();
		assertAll(
		()->assertFalse(bVF), 
		()->assertTrue(bVHP), 
	       ()-> assertFalse(bVLP)
		);
		
	    s.vidGoToNextState();
	    assertEquals(2,Global.iState);
		
}
}
