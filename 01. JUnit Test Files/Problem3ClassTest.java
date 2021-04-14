package Homework4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem3ClassTest {

	private Problem3Class p3c;

	@Before
	public void setUp() throws Exception {
		p3c = new Problem3Class();
	}

	@Test
	@FileParameters("src/CSV Files/Problem3TestCaseTable.csv")
	public void test(int TestCaseNumber, boolean prime, int memberPoints, double total, boolean r, String BasisPath) {
		assertEquals(r, p3c.approveCart(prime, memberPoints, total));
	}
}
