package vehicle.test;

import static org.junit.Assert.*; 
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.Test;
import vehicle.app.Global;
//import vechile.app.State;

import vehicle.app.StateChild;
public class GoToNextStateTest {
	 StateChild s=new StateChild();
	 boolean bVF , bVLP,bVHP ;
	 
	@Test
	public void StateTestCase4()
		{ 
		StateChild.flag1=true;
		StateChild.flag2=false;
		StateChild.flag3=false;
		    assertAll(		
				    ()->	assertTrue(StateChild.flag1),
				    ()->	assertFalse(StateChild.flag2),
				    ()->	assertFalse(StateChild.flag3)
				 );
		 		StateChild.validateCallFailure=0;
		 		StateChild.validateCallLowP=0;
		 		StateChild.validateCallHighP=0;
		 		StateChild.Seq="";



		    s.vidGoToNextState();
		    assertAll(
		      () -> assertEquals(1,StateChild.validateCallFailure),
		      () -> assertEquals(0,StateChild.validateCallLowP),
		      () -> assertEquals(0,StateChild.validateCallHighP),
		      ()-> assertEquals("a",StateChild.Seq),
			    ()->	assertEquals(4,Global.iState)
			    );
		}    
	
	//***************************************************************************************

	@Test
	public void StateTestCase3()
	{   
		StateChild.flag1=false;
		StateChild.flag2=false;
		StateChild.flag3=false;
    assertAll(		
    		()->assertFalse(StateChild.flag1), 
    		()->assertFalse(StateChild.flag2), 
  	      ()->assertFalse(StateChild.flag3)
		 );
		StateChild.validateCallFailure=0;
		StateChild.validateCallLowP=0;
		StateChild.validateCallHighP=0;
		StateChild.Seq="";
	    s.vidGoToNextState();
		assertAll(

	      () -> assertEquals(1,StateChild.validateCallFailure),
	      () -> assertEquals(1,StateChild.validateCallLowP),
	      () -> assertEquals(1,StateChild.validateCallHighP),

	      ()-> assertEquals("abc",StateChild.Seq),
	    ()->  assertEquals(3,Global.iState)
		);
	
		

	}
//*******************************************************************************************************

	@Test
	public void StateTestCase2()
		{ 
		StateChild.flag1=false;
		StateChild.flag2=false;
		StateChild.flag3=true;
		    assertAll(
				    ()->	assertFalse(StateChild.flag1),
				    ()->	assertFalse(StateChild.flag2),
				    ()->	assertTrue(StateChild.flag3));
	 		StateChild.validateCallFailure=0;
	 		StateChild.validateCallLowP=0;
	 		StateChild.validateCallHighP=0;
	 		StateChild.Seq="";

		    s. vidGoToNextState();
		    assertAll(
		      () -> assertEquals(1,StateChild.validateCallFailure),
		      () -> assertEquals(1,StateChild.validateCallLowP),
		      () -> assertEquals(1,StateChild.validateCallHighP),

		      ()-> assertEquals("abc",StateChild.Seq),
	
		    ()->	assertEquals(2,Global.iState)
		    );
		}
//********************************************************************************************************

	@Test
	public void StateTestFTF() {

		StateChild.flag1=false;
		StateChild.flag2=true;
		StateChild.flag3=false;
	    assertAll(
	 		    ()->	assertFalse(StateChild.flag1),
	 		    ()->	assertTrue(StateChild.flag2),
	 		    ()->	assertFalse(StateChild.flag3));
 		StateChild.validateCallFailure=0;
 		StateChild.validateCallLowP=0;
 		StateChild.validateCallHighP=0;
 		StateChild.Seq="";

		    s. vidGoToNextState();
		    assertAll(
		      () -> assertEquals(1,StateChild.validateCallFailure),
		      () -> assertEquals(1,StateChild.validateCallLowP),
		      () -> assertEquals(0,StateChild.validateCallHighP),

		      ()-> assertEquals("ab",StateChild.Seq),
		    ()->	assertEquals(1,Global.iState)
		    );

		
	}
	

}
