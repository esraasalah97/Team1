package vehicle.test;

import static org.junit.jupiter.api.Assertions.*;   

import org.junit.Test;


import vehicle.app.State;
import vehicle.hal.Temp;
//import vehicle.app.*;

public class StateTest2 {
	int tempIread2=0;
	 State myState= new State() ;
	 
	 
		@Test
		public	void testTempReadCalling(){
			Temp.validateCall=0;
			System.out.println("Temp Function Calling Test Case Started");
			myState.bValidateHighPerformance();
			assertEquals(1,Temp.validateCall);
		}
	 
	 
	@Test
	public	void testbValidateHighPerformanceTc1(){
		System.out.println("High Performance Test Case 1 Started");
		Temp.temp=45;
		myState.bValidateHighPerformance();
	
		// Soft Assertion to check all the assert statements even if one failed.
		assertAll(
			() ->	assertTrue(Temp.iReadT1()<=50,"Temp Reading is less than 50"),
			() ->	assertTrue(myState.bValidateHighPerformance(),"LOW PERFORMANCE")
				);
		
	}
	
	@Test
	public void testbValidateHighPerformanceTc2(){
		System.out.println("low Performance Test Case 2 Started");
		Temp.temp=60;
		myState.bValidateHighPerformance();
		
		// Soft Assertion to check all the assert statements even if one failed.
		assertAll(
			() ->	assertTrue(Temp.iReadT1()>50,"Temp Reading is greater than 50"),
			() ->	assertFalse(myState.bValidateHighPerformance(),"HIGH PERFORMANCE")
				);
	}

}
