package itb.stei.rpl.ppl.tugas1;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Kelas MainProgTest, yang digunakan untuk melakukan pengujian terhadap
 * kelas MainProg.
 * 
 * @author edbert
 */
public class MainProgTest {

    private ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    public MainProgTest() {
    }
    
    @Before
    public void setUp() {
        System.setOut(new PrintStream(outContent));
    }
    
    @After
    public void tearDown() {
        System.setOut(null);
    }

    /**
     * Method yang digunakan untuk melakukan testing pada method w().
     */
    @Test
    public void wTest() {
        MainProg mainProg = new MainProg();
        assertEquals(2, mainProg.w());
    }
    
    /**
     * Method yang digunakan untuk melakukan testing pada method main().
     */
    @Test
    public void mainTest() {
        
        MainProg mainProg = new MainProg();
        mainProg.main(null);
        String[] tempPrinted = outContent.toString()
            .split(System.getProperty("line.separator"));
        assertEquals("ctor-A", tempPrinted[0]);
        assertEquals("ctor-AB", tempPrinted[1]);
        assertEquals("ctor-ABB", tempPrinted[2]);
        assertEquals("ctor-P", tempPrinted[3]);
        assertEquals("ctor-Q", tempPrinted[4]);
        assertEquals("ABB", tempPrinted[5]);
        assertEquals("0", tempPrinted[6]);
        assertEquals("1", tempPrinted[7]);
        assertEquals("2", tempPrinted[8]);
        assertEquals("3", tempPrinted[9]);
        assertEquals("4", tempPrinted[10]);
        assertEquals("5", tempPrinted[11]);
        assertEquals("6", tempPrinted[12]);
        assertEquals("7", tempPrinted[13]);
    }
}
