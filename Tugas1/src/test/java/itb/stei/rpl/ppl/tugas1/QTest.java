/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itb.stei.rpl.ppl.tugas1;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import junit.framework.TestCase;

/**
 *
 * @author adesuk
 */
public class QTest extends TestCase {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    
    public QTest() {
    }
    
    @Override
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        super.setUp();
    }
    
    @Override
    public void tearDown() throws Exception {
        System.setOut(null);
        super.tearDown();
    }
    
    public void testQ() {
        Q obj = new Q();
        assertEquals("ctor-Q",outContent.toString().trim());
    }
   
}
