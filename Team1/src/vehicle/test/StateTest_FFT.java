package vehicle.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;


import vehicle.app.Global;
import vehicle.app.State;

public class StateTest_FFT {
	@Test
	public void StateTestCase4()
	{ State s=new State();
		boolean bVF=s.bValidateFailure();
		boolean bVHP=s.bValidateHighPerformance();
		boolean bVLP=s.bValidateLowPerformance();
		
		 s. vidGoToNextState();
		 try { assertAll(
		    ()->	assertFalse(bVF),
		    ()->	assertFalse(bVHP),
		    ()->	assertTrue(bVLP),
		    () -> assertEquals((2,State.validateseq1)&&(0,State.validateseq2)),
			   //?????
		   //?????
		 () -> assertEquals(1,State.validateCallLowP),
		    ()->	assertEquals(1,Global.iState)
		    
		    );}
		 catch (Exception e) {
			 System.out.println("Blah");
			 // TODO: handle exception
		}
		 
	    }
	   
}

