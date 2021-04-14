package Homework5;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem5ClassTest {

	private Problem5Class p5c;
	Problem5ServerData data;

	@Before
	public void setUp() throws Exception {
		p5c = new Problem5Class();
		data = EasyMock.strictMock(Problem5ServerData.class);
	}

	@Test
	@FileParameters("src/CSV Files/Problem5TestCaseTable.csv")
	public void test(int TestCaseNumber, double cart, boolean validCode, boolean validDigitalCoupon, boolean loyaltyCard, double r, String BasisPath, String MCDC) {
		EasyMock.expect(data.getCart()).andReturn(cart);
		EasyMock.replay(data);
		assertEquals(r, p5c.calcCart(data, loyaltyCard, validCode, validDigitalCoupon), 0.01);
	}
}
