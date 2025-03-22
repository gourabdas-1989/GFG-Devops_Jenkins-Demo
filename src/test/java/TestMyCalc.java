import static org.junit.Assert.*;

import org.gd.devops.prac.Calc;
import org.junit.Test;

public class TestMyCalc {
	
	Calc calc=new Calc();
	@Test
	public void testSum() {
		assertEquals(30,calc.sum(20, 10));
		assertEquals(10,calc.sum(5, 15));
		assertEquals(10,calc.sum(80, 20));
		//fail("Not yet implemented");
	}
	public void testdiff() {
		assertEquals(30,calc.subtract(40, 10));
		assertEquals(10,calc.subtract(20, 10));
		assertEquals(10,calc.sum(80, 20));
		//fail("Not yet implemented");
	}

}
