package Homework4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem5ClassTest {

	private Problem5Class p5c;

	@Before
	public void setUp() throws Exception {
		p5c = new Problem5Class();
	}

	@Test
	@FileParameters("src/CSV Files/Problem5TestCaseTable.csv")
	public void test(int TestCaseNumber, double x, double y, String BasisPath) {
		double delta=0.001;
		assertEquals(y, p5c.calcY(x), delta);
	}

}
