package epam22;

import static org.junit.Assert.*;

import org.junit.Test;

import epam21.InterestCalculator;

public class CostTest {

	@Test
	public void test() {
		
		ConstructionCost test= new ConstructionCost();
		double result=test.cost("High",1000,"Yes");
		assertEquals(2500000,result,0);
	}
}
