package methodex;

public class Ex01 {

//	static void sum(int x, int y) { //메소드 선언문
//		int c;
//		c=x+y;
//		System.out.println("a + b = "+c);
//	}
//	
//	public static void main(String[] args) { //메인 메소드 선언문
//		int a=10, b=20;
//		sum(a,b); //sum 메소드 호출문
//		sum(4,5); //sum 메소드 호출문
		
	
		static int sum(int x, int y) {
			int c;
			c=x+y;
			return c;
		}
		
		public static void main(String[] args) {
			int a=10, b=20;
			int i1=sum(a,b);
			int i2=sum(4,5);
			
			System.out.println("a + b = "+i1);
			System.out.println("a + b = "+i2);
		
	}
}
