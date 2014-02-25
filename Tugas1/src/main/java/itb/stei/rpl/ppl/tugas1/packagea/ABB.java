/**
 * Kelas ABB adalah turunan dari kelas AB
 * @author Asri Maspupah
 */

package itb.stei.rpl.ppl.tugas1.packagea;

public class ABB extends AB {
    private int x;
	
     /**
     * Kontruktor dari Kelas ABB membuat objek Kelas A dengan
     * melakukan print "ctor-ABB" ke layar dan mengisi atribut x = 0
     */
    public ABB() {
	System.out.println("ctor-ABB");
	x = 0;
    }

    /**
    * Kontruktor dari Kelas ABB membuat objek Kelas A dengan
    * mengisi atribut x = parameter input
    * @param integer newx
    */
    public ABB(int newx) {
	x = newx;
    }

    /**
    * Sebuah method yang meng-override method f() dari parent (kelas AB)
    * dengan melakukan print "ABB" ke layar
    */
    @Override
    public void f() {
	System.out.println("ABB");
    }

    /**
    * Sebuah method untuk menampilkan nilai x ke layar
    */
    @Override
    public String toString() {
	return ("nilai atribut x = " + x);
    }	
}
