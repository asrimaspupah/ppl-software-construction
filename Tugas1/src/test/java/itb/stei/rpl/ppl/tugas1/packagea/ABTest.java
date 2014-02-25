/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itb.stei.rpl.ppl.tugas1.packagea;

import itb.stei.rpl.ppl.tugas1.packagea.AB;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import junit.framework.TestCase;

/**
 * @author asri maspupah
 * Kelas Atest untuk melakukan pengujian kelas A
 */
public class ABTest extends TestCase {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    public ABTest(String testName) {
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

    /**
     * method untuk melakukan pengujian terhadap konstruktor Kelas AB
     */
    public void testAB(){
        AB obj = new AB();
        String[] tempPrinted = outContent.toString().split(//
                System.getProperty("line.separator"));
        assertEquals("ctor-AB",tempPrinted[1]);
    }
    
     /**
     * method untuk melakukan pengujian terhadap method f()
     */    
    public void testF(){
        AB obj = new AB();
        obj.f();
        String[] tempPrinted = outContent.toString().split(//
                System.getProperty("line.separator"));
        assertEquals("AB",tempPrinted[2]);
    }

    /**
     * method untuk melakukan pengujian terhadap method g()
     */
    public void testG(){
        AB obj = new AB();
        obj.g();
        String[] tempPrinted = outContent.toString().split(//
                System.getProperty("line.separator"));
        assertEquals("implement method g di AB",tempPrinted[2]);
    }
    
     /**
     * method untuk melakukan pengujian terhadap method v()
     */
    public void testV(){
        AB obj = new AB();
        obj.v();
         String[] tempPrinted = outContent.toString().split(//
                System.getProperty("line.separator"));
         assertEquals("implement method v di AB",tempPrinted[2]);
    }
    
}
