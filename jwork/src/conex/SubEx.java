package conex;

public class SubEx {
	public static void main(String[] args) {
		Sub S1=new Sub();
		S1.submd(3);
	}
}

class Sub{
	int x;
	
	public Sub() {
	}
	
	public void submd(int x) {
		this.x=x;
		//반복문 출력결과 : x값을 받아서 x값의 숫자만큼 아래문구 출력
		//sub클래스의 submd메소드 호출%n
		for(int i=0; i<this.x; i++)
			System.out.println("sub클래스의 submd메소드 호출");
		
	}
}