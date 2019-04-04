package vehicle.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@SelectClasses({ StateTest.class, StateTest2.class,StateTest3.class}) 
@RunWith(JUnitPlatform.class)
//@SuiteClasses({ StateTest.class, StateTest2.class,StateTest3.class})

public class Suite {

}
