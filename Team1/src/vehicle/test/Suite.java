package vehicle.test;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)

//@SelectClasses({ StateTest3.class,StateTest2.class}) 
@SelectPackages("vehicle.test")
public class Suite {

}
