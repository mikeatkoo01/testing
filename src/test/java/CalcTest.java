import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {

	private Calculator calc = new Calculator();

	@Test
	void testAdd() {
		Assertions.assertEquals(10, calc.add(5, 5));
	}

	void testTake() {
		Assertions.assertEquals(10, calc.take(5, 5));
	}

	void testMulti() {
		Assertions.assertEquals(10, calc.take(5, 5));
	}

//	void testsDouble() {
//		Assertions.assertEquals(, calc.divide(0, 0));
//}
}