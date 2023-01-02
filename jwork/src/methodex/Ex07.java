package methodex;

public class Ex07 {

	static int add(int i1, int i2) {
		return i1+i2;
	}
	
	static int sub(int i1, int i2) {
		return i1-i2;
	}
	
	static int mul(int i1, int i2) {
		return i1*i2;
	}
	
	static double div1(int i1, int i2) {
		return i1/i2;
	}

	static int div2(int i1, int i2) {
		return i1%i2;
	}
	
	public static void main(String[] args) {
		System.out.println("두수의 합은 "+add(5,9));
		System.out.println("두수의 차는 "+sub(5,9));
		System.out.println("두수의 곱은 "+mul(5,9));
		System.out.println("두수의 나누기의 몫은 "+div1(5,9));
		System.out.println("두수의 나누기의 나머지는 "+div2(5,9));
				
		final int a=5;
		System.out.println(a);
	}
	
}
