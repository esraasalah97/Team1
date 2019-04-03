package vehicle.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import vehicle.app.State;
import vehicle.hal.*;
class StateTest2 {
	 State myState ;
	 
	 @BeforeEach
	 void init() {
		 myState = new State();
	 }
	 
	 
	@Test
	void testbValidateHighPerformanceTc1(){
		System.out.println("High Performance Test Case 1 Started");
		myState.bValidateHighPerformance();
		
		// Soft Assertion to check all the assert statements even if one failed.
		assertAll(
			() ->	assertTrue(Temp.iReadT1()<=50,"Temp Reading is less than 50"),
			() ->	assertTrue(myState.bValidateHighPerformance(),"LOW PERFORMANCE")
				);
		
	}

}
