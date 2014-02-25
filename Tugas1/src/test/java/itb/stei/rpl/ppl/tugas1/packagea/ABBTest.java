/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itb.stei.rpl.ppl.tugas1.packagea;

import itb.stei.rpl.ppl.tugas1.packagea.A;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import junit.framework.TestCase;

/**
 * Kelas Atest untuk melakukan pengujian kelas ABB
 * @author asri maspupah
 */
public class ABBTest extends TestCase {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    public ABBTest(String testName) {
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
    * method untuk melakukan pengujian terhadap konstruktor tanpa parameter
    */
    public void testABB1(){
        ABB obj = new ABB();
        String[] tempPrinted = outContent.toString().split(//
                System.getProperty("line.separator"));
        assertEquals("ctor-ABB",tempPrinted[2]);
        assertEquals("nilai atribut x = 0",obj.toString());
    }
    
    /**
     * method untuk melakukan pengujian terhadap konstruktor dengan parameter
     */
    public void testABB2(){
        ABB obj = new ABB(3);   
        assertEquals("nilai atribut x = 3",obj.toString().trim());
    }
    
     /**
     * method untuk melakukan pengujian terhadap method f()
     */
     public void testF(){
        ABB obj = new ABB();
        obj.f();
        String[] tempPrinted = outContent.toString().split(//
                System.getProperty("line.separator"));
        assertEquals("ABB",tempPrinted[3]);
    }
     
     /**
     * method untuk melakukan pengujian terhadap method toString()
     */
      public void testToString(){
        ABB obj = new ABB(10);

        assertEquals("nilai atribut x = 10",obj.toString().trim());
    }

}
