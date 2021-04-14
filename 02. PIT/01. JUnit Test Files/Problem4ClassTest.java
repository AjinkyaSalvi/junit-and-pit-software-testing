package Homework5;

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
	public void test(int TestCaseNumber, double cart, boolean validCode, boolean validDigitalCoupon, boolean loyaltyCard, double r, String BasisPath, String MCDC) {
		assertEquals(r, p4c.calcCart(cart, loyaltyCard, validCode, validDigitalCoupon), 0.01);
	}

}
