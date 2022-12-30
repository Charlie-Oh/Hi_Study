package Opclass2;

public class Array {

	public static void main(String[] args) {

		int[] a; //int a[];
		a=new int[] {1,2,3,4,5};
		System.out.println(a);
		for(int i=0; i<5; i++) System.out.print(a[i]+" ");
		System.out.println();
		
		//배열의 길이(방개수)
		System.out.println(a.length);
//		System.out.println([I@1ee0005);
		
		int[] b=new int[5];
		b[2]=1;
		System.out.println(b);
		for(int i=0; i<b.length; i++)
			System.out.print(b[i]+" ");;
		System.out.println();
		
//		int c;
//  		System.out.println(c); //자동 초기값을 받는 경우는 지역변수가 아닌 경우만
 	
// 		int[] c;
// 		System.out.println(c);
 		
// 		int[] c=new int[5];
// 		System.out.println(c);
// 		for(int i:c) System.out.print(i+" ");
 		
 		int[] c= {1,2,3,4,5}; //int[] c=new int[]{1,2,3,4,5}; 를 축약
 		c[2]=7;
 		System.out.println(c);
 		for(int i:c) System.out.print(i+" ");
 		System.out.println();
		System.out.println("===================");
 		
 		int[] A= {95,73,100}; int tot=0;
 		double avg; int I;
		
 		for (I=0; I<A.length; I++) tot+=A[I];
 		
 		avg=(double)tot/A.length;
 		avg=tot/A.length;
 		
 		System.out.println("총합 = "+tot);
 		System.out.println("평균 = "+avg);
 		
 		System.out.println("===================");
 		int[] score= {79,88,91,33,100,55,95};
 		
 		int max=score[0];
 		int min=score[0];
 		
 		for(int j=1; j<score.length; j++) {
 			if(score[j]>max)
 				max=score[j];
 			
 			if(score[j]<min)
 				min=score[j];
 		}
 		
 		System.out.println("최대값 : "+max);
 		System.out.println("최소값 : "+min);
 		System.out.println("===================");

 		int[][]z=new int[2][3];
 		
 		z[0][0]=0; z[0][1]=1;
 		z[0][2]=2; z[1][0]=3;
 		z[1][1]=4; z[1][2]=5;
 		
 		for(int y=0; y<z.length; y++) {
 			for(int j=0; j<z[y].length; j++) {
 				if(j==z[y].length-1) System.out.println(z[y][j]);
 				else System.out.print(z[y][j]+" ");
 			}
 		}
 		
 		System.out.println("===================");

 		int[][] g=new int[2][];
 		
 		g[0]=new int[2];
 		g[1]=new int[3];
 		
 		for(int h=0; h<g.length; h++) {
 			for(int k=0; k<g[h].length; k++) {
 				g[h][k]=h+k;
 				if(k==g[h].length-1) System.out.println(g[h][k]);
 				else System.out.print(g[h][k]+" ");
 			}
 		}
 		System.out.println("===================");

 		int[][] B= {
 					{0,1},
 					{2,3,4}
 		};
 		
 		for(int l=0; l<B.length; l++) {
 			for(int u=0; u<B[l].length; u++) {
 				if(u==B[l].length-1) System.out.println(B[l][u]);
 				else System.out.print(B[l][u]+" ");
 			}
 		}
 		
 		
 		
	}

}