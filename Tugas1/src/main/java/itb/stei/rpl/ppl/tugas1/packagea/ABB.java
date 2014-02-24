/**
 * @author Asri Maspupah
 */

package itb.stei.rpl.ppl.tugas1.packagea;

public class ABB extends AB {
	private int x;
	
	public ABB() {
		System.out.println("ctor-ABB");
		x = 0;
	}

	public ABB(int newx) {
		x = newx;
	}
	
	@Override
	public void f() {
		System.out.println("ABB");
	}
	
	@Override
	public String toString() {
		return ("nilai atribut x = " + x);
	}
	
}
