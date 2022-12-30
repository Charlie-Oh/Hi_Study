package Opclass2;

public class For_label_infinity {

	public static void main(String[] args) {

		int max=3;
		for(int a=2; a<=max; a++) {
			System.out.println(a+"단");
			for(int b=1; b<=9; b++) {
				System.out.print(a+" x "+b+" = "+(a*b));
				if(!(a==max&&b==9)) System.out.println();
			}
			if(a<max) System.out.println();
		}
		System.out.println("\n===================\n");

//		System.out.println("라벨 분기문 for문");
		
//		gugudan:
//		for(int i=2; i<=9; i++) {
//			System.out.println("구구단 "+i+"단");
//			for(int j=1; j<=9; j++) {
//				if(i==4) break gugudan;
//				System.out.println(i+"*"+j+"="+(i*j));
//			}
//			System.out.println();
//		}
//		System.out.println("\n===================\n");
		System.out.println("라벨 분기문 for문");

		gugudan:
			for(int i=2; i<=9; i++) {
				System.out.println("구구단 "+i+"단");
				for(int j=1; j<=9; j++) {
					if(i%2==0) continue gugudan;
					System.out.println(i+"*"+j+"="+(i*j));
				}
				System.out.println();
			}
			System.out.println("\n===================\n");
	
//			삼항연산자
//			int j=5;
//			if(j<5) {실행문;}
//			else {실행문;}
//			j<5 ? if실행문 : else실행문

			//무한루프문 - 반드시 break문이 있어야 한다.
//			System.out.println("무한루프 for문");
			int i=1;
//			for ( ; ; ) {
//				System.out.print((i!=1?"  ":"")+i);
//				if (++i>10) break;
//			}
//			System.out.println("\n종료 후 i의 값: "+i);
//			System.out.println("\n===================\n");
			
//			System.out.println("무한루프 while문");
//			i=1;
//			while(true) {
//				System.out.print((i!=1?"  ":"")+i);;
//				if(++i>10) break;
//			}
//			System.out.println("\n종료 후 i의 값: "+i);
//			System.out.println("\n===================\n");
//			
			System.out.println("무한루프 do ~ while문");
			i=1;
			do {
				System.out.print((i!=1?"  ":"")+i);
				if(i++>10) break;
			}while(true);
			System.out.println("\n종료 후 i의 값: "+i);
			System.out.println("===================");

			System.out.println("\'무한\'\t루프\\\n\"for문\"");
			System.out.println("===================");

			String s="문자열 출력";
			int I=10;
			double d=3.141592;
			System.out.println(s+" "+I);
			System.out.print("문자열 출력 10");
			System.out.println();
			System.out.printf("문자열 출력 10\n");
			System.out.printf("%d\n",10);
			System.out.printf("%o\n",10);
			System.out.printf("%x\n",10);
			System.out.printf("%X\n",10);
			System.out.printf("%s\n","abc");
			System.out.printf("%f\n",3.2582);
			System.out.printf("%10.2f\n",3.2582);
			System.out.printf("%-10d과%.4f\n",10,3.2582);
			
	}

}