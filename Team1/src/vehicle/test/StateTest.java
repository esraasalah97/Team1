package Vechile.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

<<<<<<< HEAD
	public void StateTestCase1()
	{ //no_testcase
		boolean bVF=s.bValidateFailure();
		boolean bVHP=s.bValidateHighPerformance();
		boolean bVLP=s.bValidateLowPerformance();
		if( bVF==false && bVHP==false && bVLP==false )
		{
	    s. vidGoToNextState();
	    assertEquals(3,Global.iState);
		}
=======
import Vechile.app.State;
>>>>>>> bf5c276b18a800aead8749d13b9b20e9ab4c4682


class StateTest {
	
	 State myState ;
	 
	 @BeforeEach
	 void init() {
		 myState= new State();
	 }
	@Test
	void testTempReadCalling(){
		System.out.println("Temp Function Calling Test Case Started");
		myState.bValidateHighPerformance();
		assertEquals(1,State.validateCall);
	}

}
