package For_while;

public class For_Ex01 {

	public static void main(String[] args) {
		/*   for문을 이용하여 2단 3단만 출력하시오
		 * 	=======================
			2단
			2 x 1 = 2
			.
			.
			2 x 9 = 12
			2단이 끝났습니다.
			
			3단
			3 x 1 = 3
			.
			.
			3 x 9 = 27
			3단이 끝났습니다.*/
		
//		System.out.print("====================\n");
//		for(int i=2; i<=3; i++) {
//			System.out.println(i+"단");
//			for(int j=1; j<=9; j++) {
//				System.out.println(i+" x "+j+" = "+i*j);
//				if(j==9) {
//					System.out.println(i+"단이 끝났습니다."+"\n");
//				}
//			}
//		}
		
		int a=2, b=3;
		System.out.print("====================\n");
			for(int I=1; I<=9; I++) {
				if(a==2) System.out.println(a+"x"+I+"="+a*I);
				System.out.println(b+"x"+I+"="+b*I);
			}
		
	}
}
