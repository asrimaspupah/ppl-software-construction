/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itb.stei.rpl.ppl.tugas1.packagea;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import junit.framework.TestCase;

/**
 *
 * @author asri maspupah
 */
public class ATest extends TestCase {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    public ATest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        System.setOut(null);
        super.tearDown();
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
    
    public void testF(){
        A obj = new A();
        obj.f();
        String[] tempPrinted = outContent.toString().split(//
                System.getProperty("line.separator"));
        assertEquals("A",tempPrinted[1]);
    }
     public void testA(){
        A obj = new A();
        assertEquals("ctor-A",outContent.toString().trim());
    }
}
