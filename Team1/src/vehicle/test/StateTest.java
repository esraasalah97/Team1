package vehicle.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
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
		if(assertEquals(false,bVF) & assertEquals(true,bVHP) & assertEquals(false,bVLP ))
		{
	    s.vidGoToNextState();
	    assertEquals(2,Global.iState);
		}
}
}
