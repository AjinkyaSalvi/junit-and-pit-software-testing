package Homework4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem2ClassTest {

	private Problem2Class p2c;
	private Problem2ClassAlarm p2ca;

	@Before
	public void setUp() throws Exception {
		p2c = new Problem2Class();
		p2ca = new Problem2ClassAlarm();
	}

	@Test
	@FileParameters("src/CSV Files/Problem2TestCaseTable.csv")
	public void test(int TestCaseNumber, double batteryLevel, boolean red, boolean yellow, boolean green, boolean strobe, boolean bell, String BasisPath) {

		p2c.calcLights(batteryLevel, p2ca);

		assertEquals(red, p2ca.isRedLight());
		assertEquals(yellow, p2ca.isYellowLight());
		assertEquals(green, p2ca.isGreenLight());
		assertEquals(strobe, p2ca.isStrobe());
		assertEquals(bell, p2ca.isBell());
	}
}
