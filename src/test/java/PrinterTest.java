import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(200);
    }

    @Test
    public void hasSheetsPaper(){
        assertEquals(200, printer.getSheetsPaper());
    }

    @Test
    public void checkPrintRunsIfEnoughPaper(){
        assertEquals(100, printer.print(5, 20));
    }

    @Test
    public void checkPrintDoesNotRunIfEnoughPaper(){
        assertEquals(-1, printer.print(50, 5));
    }
}
