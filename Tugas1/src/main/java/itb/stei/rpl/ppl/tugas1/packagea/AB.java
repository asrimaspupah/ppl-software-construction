/**
 * @author Asri Maspupah
 */

package itb.stei.rpl.ppl.tugas1.packagea;

public class AB extends A implements B, C{

	public AB() {
		System.out.println("ctor-AB");
	}
	
	public void v() {
		// TODO Auto-generated method stub
		System.out.println("implement method v di AB");
	}
	
	public void g() {
		System.out.println("implement method g di AB");	
	}
	
	@Override
	public void f() {
		System.out.println("AB");
	}

}
