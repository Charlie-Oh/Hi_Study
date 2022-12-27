package jwork;


public class Hello {

	public static void main(String[] args) {
		byte x=5;
		int a=x;
		System.out.println(a);
		System.out.println(x);
		
//		 1줄 주석 (Ctrl+/)
		/* 여러줄 주석
		 * 2줄 */
		
		boolean bool1 = true;
		boolean bool2=false;
		System.out.println(bool1);
		System.out.println(bool2);
		System.out.println();

		byte value1=10;
		short value2=-10;
		int value3=100;
		long value4=-100L;
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		System.out.println();
		
		float value5=1.2F;
		double value6=-1.5;
		double value7=5;
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		
		char value11 = 'A', value22 = '가', value33 = '3';
		System.out.println(value11);
		System.out.println(value22);
		System.out.println(value33);
		System.out.println();

		char value44=97, value55=0xac00, value66=51, value77='6';
		System.out.println(value44);
		System.out.println(value55);
		System.out.println(value66);
		System.out.println(value77);
		System.out.println();
		
		short b = 5;
		byte s = (byte) b;
		System.out.println(s);
		
		int bb=97;
		char ss=(char) bb;
		System.out.println(ss);
		System.out.println("\"안녕\" 자바 "+(5+6));
		
		int z=5;
		System.out.println(z);
		z=7;
		System.out.println(z);

	}

}
