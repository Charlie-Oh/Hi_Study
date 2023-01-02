package methodex;

class Point01{
	int a;
	int b;
}

public class Class01 {
	static void md() {
		System.out.println("메소드");
	}
	
	public static void main(String[] args) {
		//객체생성문
		Point01 pt01=new Point01();
		pt01.a=10;
		pt01.b=20;
		System.out.println(pt01.a+", "+pt01.b);
	}
}
