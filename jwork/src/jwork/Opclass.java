package jwork;


public class Opclass {

	public static void main(String[] args) {
		int a=10;
		int b=a;
		System.out.println(b);
		
		b += a;
		System.out.println(b);
		
		b -= a;
		System.out.println(b);
		
		b *= a;
		System.out.println(b);

		b /= a;
		System.out.println(b);

		b %= a;
		System.out.println(b);

		int x=10;
		int y=5;
		System.out.println("x==y:"+(x==y));
		System.out.println("x>y:"+(x>y));
		System.out.println("x>=y:"+(x>=y));
		System.out.println("x<y:"+(x<y));
		System.out.println("x<=y:"+(x<=y));
		System.out.println("x!=y:"+(x!=y));
		
	}

}
