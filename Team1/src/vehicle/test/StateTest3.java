package vehicle.test;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import vehicle.app.State;
import vehicle.hal.*;

class StateTest3 {
 State myState ;
 
 @BeforeEach
 void init() {
	 myState= new State();
 }
	@Test
	void testbValidateHighPerformanceTc2(){
		System.out.println("High Performance Test Case 2 Started");
		myState.bValidateHighPerformance();
		// Soft Assertion to check all the assert statements even if one failed.
		assertAll(
			() ->	assertTrue(Temp.iReadT1()>50,"Temp Reading is greater than 50"),
			() ->	assertFalse(myState.bValidateHighPerformance(),"HIGH PERFORMANCE")
				);
	}

}
