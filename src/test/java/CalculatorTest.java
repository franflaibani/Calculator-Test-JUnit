import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void additionTest() {
        int result = calculator.addition(3, 2);
        assertEquals(5, result);
    }

    @Test
    public void additionWithXNegativeTest() {
        int result = calculator.addition(-3, 2);
        assertEquals(-1, result);
    }

    @Test
    public void additionWithYNegativeTest() {
        int result = calculator.addition(3, -2);
        assertEquals(1, result);
    }

    @Test
    public void subtractTest() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void subtractTestWithNegativeResultTest() {
        int result = calculator.subtract(3, 5);
        assertEquals(-2, result);
    }

    @Test
        public void subtractTestWithYNegativeAndPositiveResultTest() {
        int result = calculator.subtract(5, -5);
        assertEquals(10, result);
    }

    @Test
    public void multiplyTest() {
        int result = calculator.multiply(3, 4);
        assertEquals(12, result);
    }

    @Test
    public void multiplyWithNegativeResultTest() {
        int result = calculator.multiply(3, -4);
        assertEquals(-12, result);
    }

    @Test
    public void multiplyWithPositiveResultTest() {
        int result = calculator.multiply(-3, -4);
        assertEquals(12, result);
    }

    @Test
    public void divideTest() {
        int result = calculator.divide(9, 3);
        assertEquals(3, result);
    }

    @Test
    public void divideWithYEquals0Test() {
        int result = calculator.divide(9, 0);
        assertEquals(0, result);
    }

    @Test
    public void powerTest() {
        int result = calculator.power(4, 3);
        assertEquals(64, result);
    }

    @Test
    public void powerWithExponentEqualTo0Test() {
        int result = calculator.power(4, 0);
        assertEquals(1, result);
    }

    @Test
    public void squareRootTest() {
        int result = calculator.squareRoot(9);
        assertEquals(3, result);
    }

    @Test
    public void squareRootWithNegativeNumberTest() {
        int result = calculator.squareRoot(-9);
        assertEquals(0, result);
    }

    @Test
    public void squareRootWithANumberWithDecimalRootTest() {
        int result = calculator.squareRoot(5);
        assertEquals(2, result);
    }

    @Test
    public void modulusTest() {
        int result = calculator.modulus(10, 3);
        assertEquals(1, result);
    }

    @Test
    public void modulusWithXNegativeTest() {
        int result = calculator.modulus(-10, 3);
        assertEquals(-1, result);
    }

    @Test
    public void modulusWithYNegativeTest() {
        int result = calculator.modulus(10, -3);
        assertEquals(1, result);
    }

    @Test
    public void greaterThanTest() {
        boolean result = calculator.greaterThan(3, 2);
        assertTrue(result);
    }

    @Test
    public void greaterThanWithANumberThatIsSmallerTest() {
        boolean result = calculator.greaterThan(2, 3);
        assertFalse(result);
    }

    @Test
    public void greaterThanWithTheSameNumberTest() {
        boolean result = calculator.greaterThan(3, 3);
        assertFalse(result);
    }

    @Test
    public void smallerThanTest() {
        boolean result = calculator.smallerThan(2, 3);
        assertTrue(result);
    }

    @Test
    public void smallerThanWithANumberThatIsGreaterTest() {
        boolean result = calculator.smallerThan(3, 2);
        assertFalse(result);
    }

    @Test
    public void smallerThanWithTheSameNumberTest() {
        boolean result = calculator.smallerThan(3, 3);
        assertFalse(result);
    }

    @Test
    public void equalsTest() {
        boolean result = calculator.equals(10, 10);
        assertTrue(result);
    }

    @Test
    public void equalsButTheyAreNotEqualsTest() {
        boolean result = calculator.equals(10, 12);
        assertFalse(result);
    }

    @Test
    public void absoluteTestWithPositiveNumberTest() {
        int result = calculator.absolute(10);
        assertEquals(10, result);
    }

    @Test
    public void absoluteTestWithNegativeNumberTest() {
        int result = calculator.absolute(-10);
        assertEquals(10, result);
    }

    @Test
    public void isPairTest() {
        boolean result = calculator.isPair(4);
        assertTrue(result);
    }

    @Test
    public void isPairWithANonPairNumberTest() {
        boolean result = calculator.isPair(5);
        assertFalse(result);
    }

    @Test
    public void isPairWithANegativePairNumberTest() {
        boolean result = calculator.isPair(-4);
        assertTrue(result);
    }

    @Test
    public void isPairWithANegativeNonPairNumberTest() {
        boolean result = calculator.isPair(-5);
        assertFalse(result);
    }

    @Test
    public void isPrimeTest() {
        boolean result = calculator.isPrime(5);
        assertTrue(result);
    }

    @Test
    public void isPrimeWithANonPrimeNumberTest() {
        boolean result = calculator.isPrime(6);
        assertFalse(result);
    }

    @Test
    public void isPrimeWithANegativeNumber() {
        boolean result = calculator.isPrime(-5);
        assertFalse(result);
    }
}
