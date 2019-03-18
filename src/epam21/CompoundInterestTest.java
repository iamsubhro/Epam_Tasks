package epam21;

import static org.junit.Assert.*;

import org.junit.Test;
import java.text.DecimalFormat;
public class CompoundInterestTest {
	
	private static DecimalFormat df = new DecimalFormat(".##");

	@Test
	public void test() {
		
		InterestCalculator test= new InterestCalculator();
		double result=test.compoundint(5000,5,10);
		String answer=df.format(result);
		String expect="3144.47";
		assertEquals(expect,answer);
	}

}
