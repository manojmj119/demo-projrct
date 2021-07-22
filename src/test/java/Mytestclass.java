import static org.junit.Assert.*;

import org.junit.Test;

public class Mytestclass {

	@Test
	public void test() {
		assertEquals(1,Myclass.findMax(new int[] {1,2,3,4}));
	}

}
