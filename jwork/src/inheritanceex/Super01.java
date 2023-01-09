package inheritanceex;

class Pa4{
	int x=1000;
	void display() {
		System.out.println("상위클래스 display()");
	}
}

class Ch4 extends Pa4{
	int x=2000;
	void display() {
		System.out.println("하위클래스 display()");
	}
	void write() {
		super.display();
		this.display();
		System.out.println("super.x : "+super.x);
		System.out.println("this.x : "+x);
	}
}

public class Super01 {
	public static void main(String[] args) {
		Ch4 d=new Ch4();
		d.write();
	}
}
