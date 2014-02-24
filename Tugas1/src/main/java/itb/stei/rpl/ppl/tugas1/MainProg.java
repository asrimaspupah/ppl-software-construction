package itb.stei.rpl.ppl.tugas1;

import itb.stei.rpl.ppl.tugas1.packagea.ABB;
import java.util.Vector;

/**
 * Kelas program utama
 * 
 * @author edbert
 */
public class MainProg implements X {
    
    /**
     * Meng-implement method w() dari interface X.
     * 
     * @return bilangan integer yang telah ditentukan
     */
    public int w() {
        return 2;
    }
    
    /**
     * Method main untuk menjalankan program
     * 
     * @param args 
     */
    public static void main(String[] args) {
        ABB a = new ABB();
        P p = new P();
        Q q = new Q();
        Vector<Integer> v = new Vector<Integer>(AllConst.N);
        a.f();
        for (int i = 0; i < AllConst.N; i++) {
            v.add(i);
        }
        for (Integer i : v) {
            System.out.println(i);
        }
    }
    
}
