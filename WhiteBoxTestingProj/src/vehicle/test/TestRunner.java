package vehicle.test;

import org.junit.runner.JUnitCore; 
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Result result=new JUnitCore().run(AllTests.class);
		System.out.println("Run test cases: "+result.getRunCount());
	//	System.out.println("Successfull Test Cases"+result.wasSuccessful());
		System.out.println("Failure test case: "+result.getFailureCount());
		
		
		for(Failure fail:result.getFailures())
		{
		   System.out.println("Header of error: "+fail.getTestHeader());
		   System.out.println("Message of error: "+fail.getMessage());
		}

	}

}
