package vechile.test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import vechile.app.Global;
import vechile.app.Main;
import vechile.hal.LCD;
import vechile.hal.Motor;

public class VidInitTest {

	@Test
	public void VidInitTest1() {
		Main.vidInit();
		assertAll(
		() ->   assertEquals(0,Motor.motorState),
		() -> 	assertEquals(0,Global.iState),
		() -> 	assertEquals(1,LCD.validateCall),
		() -> 	assertEquals(1,Motor.validateCall),
		() -> 	assertEquals(0,LCD.LCDState),
		() -> 	assertEquals(2,LCD.validateSeq)
		);
	}

}
