import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumWordPrinterTest {

    private final NumWordPrinter printer = new NumWordPrinter();

    @Test
    public void testEven() {
        assertEquals("Even", printer.printWord(4));

    }

    @Test
    public void testEvenPrimeEleven() {
        assertEquals("EvenPrimeEleven", printer.printWord(22));

    }

    @Test
    public void testEvenPrimeLucky() {
        assertEquals("EvenPrimeLucky", printer.printWord(286));

    }

    @Test
    public void testOddOneOut() {
        assertEquals("OddOneOut", printer.printWord(5));

    }
}
