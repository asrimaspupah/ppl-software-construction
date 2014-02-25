/**
 * Kelas AB adalah turunan dari kelas A dan mengimplementasikan interface dari Kelas B dan C
 * @author Asri Maspupah
 */

package itb.stei.rpl.ppl.tugas1.packagea;

public class AB extends A implements B, C{

     /**
     * Kontruktor dari Kelas AB membuat objek Kelas A dengan
     * melakukan print "ctor-AB" ke layar
     */
    public AB() {
	System.out.println("ctor-AB");
    }

    /**
     * Sebuah method yang meng-implementasikan method v() dari Interface B
     * dengan melakukan print "implementasi method v di AB" ke layar
     */
    public void v() {
        // TODO Auto-generated method stub
	System.out.println("implement method v di AB");
    }
    
    /**
     * Sebuah method yang meng-implementasikan method g() dari Interface C
     * dengan melakukan print "implementasi method g di AB" ke layar
     */
    public void g() {
	System.out.println("implement method g di AB");	
    }
    
     /**
     * Sebuah method yang meng-override method f() dari parent (kelas A)
     * dengan melakukan print "AB" ke layar
     */
    @Override
    public void f() {
	System.out.println("AB");
    }
}
