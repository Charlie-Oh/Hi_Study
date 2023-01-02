package methodex;

public class Ex03 {
	
	public static void main(String[] args) { //메인 메소드 선언
//		int result=add(3,5); //메소드 호출문 및 반환값 받기
		int result=8;
		System.out.println(result);
		
		int[] result2= {0};
		add(3,5,result2);
		System.out.println(result2[0]);
		add(3,5,9);
		System.out.println(result);
	}
	
//	static int add(int a, int b) { //int형 리턴 add메소드 선언
//		return a+b;
//	}
	
	static void add(int a, int b, int[] result) {
		result[0]=a+b;//add메소드 선언
	}
	static void add(int a, int b, int result) { 
		result=2;
		System.out.println(result);
	}
}
