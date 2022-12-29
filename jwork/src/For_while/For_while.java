package For_while;

public class For_while {

	public static void main(String[] args) {
		//반복문 (for문)
				System.out.println("for문 1");
				int n=0;
				for(n=n; n<=10; n++) {
					System.out.println(" Hello Java"+n);
				}
				System.out.println("for문을 빠져 나옴.");
				System.out.println("종료 후 n값은 10이 아닌 "+"'"+n+"'");
				System.out.println();

				//3번 반복하기
				for(int i=1; i<=3; i++) {
					System.out.print("가");
				}
				System.out.println();
				
				for(int i=2; i<5; i++) {
					System.out.print("가");;
				}
				System.out.println();
				
				for(int i=3; i>0; i--) {
					System.out.print("가");
				}
				System.out.println();
				
				
				for(int i=0; i<3; i++) {
					System.out.print(i+" ");
				}
				System.out.println();

				for(int i=4; i<=6; i++) {
					System.out.print(i+" ");
				}
				System.out.println();

				for(int i=3; i>=1; i--) {
					System.out.print(i+" ");
				}
				System.out.println();
				
				int i=0;
				for(i=6; i>=4; i--) {
					System.out.print(i+" ");
				}
				System.out.println();
				System.out.println(i);
				
				int y=2024, m=1, d=0;
				
				for(m=m; m<=12; m++) {
				
				switch(m) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					 d=31; break;
				case 2:
					if(y%4==0) {d=29;}
					else {d=28;}
					break;
				default : d=30;
				}
				System.out.println();
				System.out.println(y+"년도의 "+m+"월");
				
				for(int I=1; I<=d; I++) {
					System.out.print(I+"일 ");
				}
			  }
				System.out.println();
				System.out.println("while문 1");
				int total=0;
				int x=1;
				while(x<=10) {
					total += x;
					x++;
				}
				System.out.println(total);
				
				int Y=1;
				while(Y<=5) {
					if(Y==1) System.out.println("while문 시작 시 : "+Y);
					System.out.print(Y+" ");
					Y++;
				}
				System.out.println("\nwhile문 종료 후 : "+Y+"\n\n");
				System.out.println();

				System.out.println("do while문 1");
				int TOTAL=0, X=1;
				do {
					TOTAL+=X;
					X++;
				} while (X<=10);
				System.out.println(TOTAL);
				System.out.println(X);
				System.out.println();
				
				System.out.println("do while문 1");
				int Z=5;
				do {
					System.out.print(Z+" ");
					Z--;
				}while(Z>=1);
				System.out.println("\ndo~while문 종료 후 : "+Z+"\n");
				System.out.println("\n=======================\n");
				
				System.out.println("for문 2");
				int tt=0;
				
				for(int N=1; N<=5; N++) {
					if(N==3) break;
					
					tt+=N;
				}
				System.out.println("합계는 "+tt);
				System.out.println();
				System.out.println("for문 3");
				
				for(int A=1; A<=10; A++) {
					if(A%2==0) {
						continue;
					}
					System.out.print(A+" ");
				}

				System.out.println("for문 4");
				int t2=0;
				
				for(int B=0; B<3; B++) {
					for(int C=1; C<=5; C++) {
						if(C==3)
							break;
						t2+=C;
					}
				}
				System.out.println("합계는 "+t2);
				System.out.println();
				System.out.println("출력결과");
				System.out.println("=======================\n2단");
				
				int q=2, w=3;
				
					for(int p=1; p<=9; p++) {
						for(int u=1; u<=9; u++) {
							if(u<=9&&w*u==18)
								System.out.println(w+" x "+u+" = "+w*u);
						if(p<=9) 
							System.out.println(q+" x "+p+" = "+q*p); 
						}
					}
					System.out.println("\n3단"); 

						
//					for(int P=1; P<=9; P++) {
//							if(P==10) break;
//							System.out.println(w+" x "+P+" = "+w*P); 
//					}
//						for(int u=1; u<=9; u++) {
//							if(u==10) break;
//							System.out.println(w+" x "+u+" = "+w*u);
//						}
			
			}
		}