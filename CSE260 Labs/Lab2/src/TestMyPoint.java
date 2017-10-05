import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMyPoint {
	MyPoint one, two;
	@Before
	public void setUp() throws Exception {
		 one = new MyPoint(0,0);
		 two = new MyPoint(10, 30.5);
	}

	@Test
	public void test() {
		
		System.out.println(one.distance(two));
	}

}
