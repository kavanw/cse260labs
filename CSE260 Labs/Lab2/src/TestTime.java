import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestTime {

	Time test, test2;
	@Before
	public void setUp() throws Exception {
		 test = new Time();
		 test2 = new Time(555550000);
	}

	@Test
	public void test() {
		
		System.out.println("Current Time: " + test.toString());
		System.out.println(test2);
	}

}
