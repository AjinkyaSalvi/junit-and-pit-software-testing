package Homework4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTest {

	private Problem4Class p4c;

	@Before
	public void setUp() throws Exception {
		p4c = new Problem4Class();
	}

	@Test
	@FileParameters("src/CSV Files/Problem4TestCaseTable.csv")
	public void test(int TestCaseNumber, boolean autoclave, double temperature, double pressure, Problem4Class.autoClaveEnum r, String BasisPath, String Comments) {
		assertEquals(r, p4c.autoClave(autoclave, temperature, pressure));
	}

}
