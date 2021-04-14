package Homework5;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem2ClassTest {

Problem2Class p2c;
@Before
public void setUp() throws Exception {
p2c = new Problem2Class();
}

@Test
@FileParameters("src/CSV Files/Problem2TestCaseTable.csv")
public void test(int TestCaseNo, int BoxinCarNumber, int RailRoadCarNumber, int ShipmentNumber, int PreviousBoxNumber, String BasisPath, String Comments) {
//fail("Not yet implemented");
assertEquals(PreviousBoxNumber,p2c.calcPrevBoxNumber(BoxinCarNumber, RailRoadCarNumber, ShipmentNumber));
}

}
