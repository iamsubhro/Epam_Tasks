package epam2;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class DivisionTest {

	@Test
	public void test() {
		
		Calculator test= new Calculator();
		int result=test.div(5,2);
		assertEquals(2,result);
	}

}
