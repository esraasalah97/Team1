package vechile.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;

import org.junit.Test;

import vechile.app.Global;
import vechile.app.State;

public class GoToNextStateTest {
	 State s=new State();
	@Test
	public void StateTestCase4()
		{ 
			boolean bVF=s.bValidateFailure();
			boolean bVLP=s.bValidateLowPerformance();
			boolean bVHP=s.bValidateHighPerformance();
		    s. vidGoToNextState();
		    assertAll(
		    ()->	assertTrue(bVF),
		    ()->	assertFalse(bVLP),
		    ()->	assertFalse(bVHP),
		   
		    
		      () -> assertEquals(1,State.validateCallFailure),
		      () -> assertEquals(1,State.validateCallLowP),
		      () -> assertEquals(1,State.validateCallHighP),
		      () -> assertEquals(3,State.validateseq1),
			    ()->	assertEquals(4,Global.iState)
			    );
		    State.validateCallFailure=0;
		    State.validateCallLowP=0;
		    State.validateCallHighP=0;
		    State.validateseq1=0;
		}    
	
	//***************************************************************************************
	@Test
	public void StateTestCase3()
	{ //no_testcase
		
		boolean bVF=s.bValidateFailure();
		
		boolean bVLP=s.bValidateLowPerformance();
		boolean bVHP=s.bValidateHighPerformance();
	    s.vidGoToNextState();
		assertAll(
		()->assertFalse(bVF), 
		()->assertFalse(bVHP), 
	      ()->assertFalse(bVLP),
	      () -> assertEquals(1,State.validateCallFailure),
	      () -> assertEquals(1,State.validateCallLowP),
	      () -> assertEquals(1,State.validateCallHighP),
	      () -> assertEquals(3,State.validateseq1),
	    ()->  assertEquals(3,Global.iState)
		);
	
	   
	    State.validateCallFailure=0;
	    State.validateCallLowP=0;
	    State.validateCallHighP=0;
	    State.validateseq1=0;
		

	}
//*******************************************************************************************************
	@Test
	public void StateTestCase2()
		{  
		boolean bVF=s.bValidateFailure();
		
		boolean bVLP=s.bValidateLowPerformance();
		boolean bVHP=s.bValidateHighPerformance();
		
		    s. vidGoToNextState();
		    assertAll(
		    ()->	assertFalse(bVF),
		    ()->	assertFalse(bVLP),
		    ()->	assertTrue(bVHP),
		      () -> assertEquals(1,State.validateCallFailure),
		      () -> assertEquals(1,State.validateCallLowP),
		      () -> assertEquals(1,State.validateCallHighP),
		    () -> assertEquals(3,State.validateseq1),
	
		    ()->	assertEquals(2,Global.iState)
		    );
		    State.validateCallFailure=0;
		    State.validateCallLowP=0;
		    State.validateCallHighP=0;
		    State.validateseq1=0;
		}
//********************************************************************************************************
	@Test
	public void StateTestFTF1() {
		
		boolean bVF=s.bValidateFailure();
		
		boolean bVLP=s.bValidateLowPerformance();
		boolean bVHP=s.bValidateHighPerformance();

		    s. vidGoToNextState();
		    assertAll(
		    ()->	assertFalse(bVF),
		    ()->	assertTrue(bVLP),
		    ()->	assertFalse(bVHP),
		      () -> assertEquals(1,State.validateCallFailure),
		      () -> assertEquals(1,State.validateCallLowP),
		      () -> assertEquals(1,State.validateCallHighP),
		    () -> assertEquals(3,State.validateseq1),
		    ()->	assertEquals(1,Global.iState)
		    );
		    State.validateCallFailure=0;
		    State.validateCallLowP=0;
		    State.validateCallHighP=0;
		    State.validateseq1=0;
		
	}

}
