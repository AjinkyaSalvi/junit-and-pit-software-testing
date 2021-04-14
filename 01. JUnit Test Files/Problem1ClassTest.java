package Homework4;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class Problem1ClassTest {

	private Problem1Class p1c;

	@SuppressWarnings("unused")
	private static final Object[] pp1c () {
		return $(
			/* Total number of Test Cases: 15
			1=AGL, 2=motorState, 3=chuteState*/

			// Test Case 1
			$(7_500.2, Problem1Class.motorStates.Off, Problem1Class.chuteStates.Off),
			// Test Case 2
			$(4_100.2, Problem1Class.motorStates.RB5, Problem1Class.chuteStates.Off),
			// Test Case 3
			$(2_250.1, Problem1Class.motorStates.RB4, Problem1Class.chuteStates.Off),
			// Test Case 4
			$(1_100.2, Problem1Class.motorStates.RB3, Problem1Class.chuteStates.Off),
			// Test Case 5
			$(400.2, Problem1Class.motorStates.RB2, Problem1Class.chuteStates.Deployed),
			// Test Case 6
			$(250.1, Problem1Class.motorStates.RB2, Problem1Class.chuteStates.Released),
			// Test Case 7
			$(0.1, Problem1Class.motorStates.RB1, Problem1Class.chuteStates.Released),
			// Test Case 8
			$(0.0, Problem1Class.motorStates.Off, Problem1Class.chuteStates.Released),
			// Test Case 9
			$(250.0, Problem1Class.motorStates.RB1, Problem1Class.chuteStates.Released),
			// Test Case 10
			$(400.1, Problem1Class.motorStates.RB2, Problem1Class.chuteStates.Released),
			// Test Case 11
			$(1_100.1, Problem1Class.motorStates.RB2, Problem1Class.chuteStates.Deployed),
			// Test Case 12
			$(2_250.0, Problem1Class.motorStates.RB3, Problem1Class.chuteStates.Off),
			// Test Case 13
			$(4_100.1, Problem1Class.motorStates.RB4, Problem1Class.chuteStates.Off),
			// Test Case 14
			$(7_500.1, Problem1Class.motorStates.RB5, Problem1Class.chuteStates.Off),
			// Test Case 15
			$(10_000.0, Problem1Class.motorStates.Off, Problem1Class.chuteStates.Off)
		);
	}

	@Before
	public void setUp() throws Exception {
		p1c = new Problem1Class();
	}

	@Test
	@Parameters(method="pp1c")
	public void test (double AGL, Problem1Class.motorStates expMS, Problem1Class.chuteStates expCS) {
		p1c.controlLanding(AGL);
		assertEquals(expMS, p1c.getMs());
		assertEquals(expCS, p1c.getCs());
	}
}
