package epam2;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;

public class MultiplyTest {

	@Test
	public void test() {
		
		Calculator test= new Calculator();
		ArrayList<Integer> list1=new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		
		int result=test.multiply(list1);
		assertEquals(120,result);
	}

}
