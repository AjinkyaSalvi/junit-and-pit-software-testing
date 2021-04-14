package Homework5;

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
	public void test(int TestCase, Problem3Class.state currentState, String nextState, int D, int G, int P, int Z, int B, int I, int T, int X) {
		p3c.operateBinoculars(currentState, D, G, P, Z);
		assertEquals(B, p3c.getB());
		assertEquals(I, p3c.getI());
		assertEquals(T, p3c.getT());
		assertEquals(X, p3c.getX());
	}

}
