package epam21;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleInterestTest {

	@Test
	public void test() {
		
		InterestCalculator test= new InterestCalculator();
		double result=test.simpleint(1000, 5, 4);
		assertEquals(200,result,0.001);
	}

}
