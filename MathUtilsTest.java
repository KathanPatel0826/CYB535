import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @Before
    public void setUp() {
        mathUtils = new MathUtils();
    }

    @Test
    public void testAdd() {
        assertEquals(5, mathUtils.add(2, 3));
        assertEquals(0, mathUtils.add(-2, 2));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, mathUtils.subtract(3, 2));
        assertEquals(-5, mathUtils.subtract(-3, 2));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, mathUtils.multiply(2, 3));
        assertEquals(0, mathUtils.multiply(0, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, mathUtils.divide(4, 2), 0.001);
        assertEquals(-1.0, mathUtils.divide(5, 0), 0.001);
    }
}
