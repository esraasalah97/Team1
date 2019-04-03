package Vechile.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Vechile.app.State;


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
