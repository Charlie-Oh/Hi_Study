package study;

class Memory{
	String str;
	int num;
	
	public Memory() {
	}
	public Memory(String str, int num) {
		this.str=str; this.num=num;
	}
	
	public String returnStr() {
		return str;
	}
	public int returnNum() {
		return num;
	}
}

public class MemoryEx {
	public static void main(String[] args) {
		Memory m1=new Memory("hello",5);
		System.out.println("m1객체의 출력값 : "+m1.returnStr());
		
		Memory m2=new Memory("hello",7);
		System.out.println("m2객체의 출력값 : "+m2.returnStr());
		
		Memory m3=m2;
		System.out.println("m3객체의 출력값 : "+m3.returnStr());
		
		System.out.println(m1.str.equals(m2.str)); //원하는 값만 비교
		System.out.println(m1==m2);
		System.out.println(m1==m3);
		System.out.println(m2==m3);
	}
}
