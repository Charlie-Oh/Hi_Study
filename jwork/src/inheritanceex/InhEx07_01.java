package inheritanceex;

class P3{
	int a=1;
	private int b=5;
	private void md() {
		System.out.println("P3");
	}
//	public void md() {
//		System.out.println("P3");
	public void md1() {
		md();
	}
}

class C3 extends P3{
	int c=6;
	C3(){
		md1();
	}
	public void md() {
		System.out.println("C3");
	}
}

public class InhEx07_01 {
	public static void main(String[] args) {
		C3 c=new C3();
	}
}
