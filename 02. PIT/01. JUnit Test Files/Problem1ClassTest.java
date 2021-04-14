package Homework5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem1ClassTest {

	private Problem1Class p1c;

	@Before
	public void setUp() throws Exception {
		p1c = new Problem1Class();
	}

	@Test
	@FileParameters("src/CSV Files/Problem1TestCaseTable.csv")
	public void test(int TestCaseNumber, boolean cruiseEngaged, double speed, double distance, boolean emerBrake, int pulseCount, String MCDC) {
		p1c.emerBrakeFunction(cruiseEngaged, speed, distance);
		assertEquals(emerBrake, p1c.isEmerBrake());
		assertEquals(pulseCount, p1c.getPulseCount());
	}

}
