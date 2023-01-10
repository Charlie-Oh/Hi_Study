package interfaceEx;

public class TestMain {
	public static void main(String[] args) {
		Test t=new Test();
//		Test t=new Test("홍길동",500);
		t.setName("홍길동");
		t.setAge(500);
		System.out.println(t.getName()+t.getAge());
	}
}
