/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package itb.stei.rpl.ppl.tugas1;

import itb.stei.rpl.ppl.tugas1.packagea.A;
import junit.framework.TestCase;

/**
 *
 * @author asri maspupah
 */
public class ATest extends TestCase {
    
    public ATest(String testName) {
        super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
    
    public void testF(){
        A obj = new A();
        // cek print masukin le log file
        // trus diambil isinya 
        // bandingkan dengan expeted result nya
        assertTrue(true);
    }
}
