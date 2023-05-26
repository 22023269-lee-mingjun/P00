import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	public void testAdd() {
		int a = 4321;
		int b = 1234;
			
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
			 
		int expected = 5555;
		assertEquals (expected, actual);
		}
	@Test
	public final void testSubtract() {
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(actual, expected);
	}
	@Test
	public final void testMultiple() {
		int a = 30;
		int b = 30;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a, b);
		
		int expected = 900;
		assertEquals(actual, expected);
	}
	@Test
	public final void testDivide() {
		int a = 300;
		int b = 3;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,  b);
		
		int expected = 100;
		assertEquals(actual, expected);
	}
	
}
