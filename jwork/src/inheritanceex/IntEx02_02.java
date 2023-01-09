package inheritanceex;

class P{
	int a=0;
	int b=5;
	
	public void md() {
		a=5;
		System.out.println(a+b);
	}
	void md2() {
		System.out.println("md2() 호출");
	}
}

class C extends P{
	String a="오버라이딩";
	
	public void md() {
		System.out.println(a+b);
		super.md();
		this.md1();
		md2();
	}
	public void md1() {
		System.out.println("md1()메소드 호출");
	}
}

public class IntEx02_02 {
	public static void main(String[] args) {
		C c=new C();
//		P c=new C();
//		P p=new C();
//		C cp=(C)new P();
		//업캐스팅-하위클래스(=서브클래스=자식클래스) 자료형이 상위클래스로 변환되는 것
		c.md();
		((C)c).md1();
		c.md1();
		c.md2();
	}
}
