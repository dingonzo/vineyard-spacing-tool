import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class VineyardCalculatorTest {

    @Test
    public void testStandardVineyard() {
        // (100ft row - 2*10ft posts) / 4ft spacing = 20 vines
        assertEquals(20, VineyardCalculator.calculateVines(100, 10, 4));
    }

    @Test
    public void testTinyRow() {
        assertEquals(0, VineyardCalculator.calculateVines(10, 15, 2));
    }

    @Test
    public void testExactFit() {
        // (50 - 10) / 2 = 20
        assertEquals(20, VineyardCalculator.calculateVines(50, 5, 2));
    }
}
