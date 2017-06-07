package car;

import static org.junit.Assert.*;

import org.junit.Test;

public class testCar {

	@Test
	public void test() {
		car c1=new car(100,1);
		car c2=new car(200,2);
		assertEquals(100,c1.getCap());
		assertEquals(1,c1.getbr());
		assertEquals(200,c2.getCap());
		assertEquals(2,c2.getbr());
	}

}
