package Opclass2;

public class Opclass2 {

	public static void main(String[] args) {
		double pi=3.141592;
		int r=5;
		double area;
		
		area=r*r*pi;
		System.out.println("반지름이 "+r+"인 원의 면적은 "+area);
		System.out.println();
		
		int a=3;
		
		++a;
		System.out.println("1: "+a);
		a--;
		System.err.println("2: "+a);
		
		int x=5;
		int y=++x;
		System.out.println("x: "+x+", y: "+y);

		System.out.println("3: "+x+" "+y);
		
		int x2=5;
		int y2=x2++;
		System.out.println("4: "+x2+" "+y2);
		
		System.out.println("~");
		System.out.print("~");
		System.err.println("~");
		
		int A=10, B=10;
		int C=A;
		System.out.println("A : "+A+", C : "+C);
		
		C=++A +B;
		System.out.println("A : "+A+", C : "+C);
		
		C=A++ +B;
		System.out.println("A : "+A+", C : "+C);
		
		String str="Hello";
		System.out.println(str);
		
		int n=6;
		
		if(n%2==1) {
			System.err.println("홀수");
		} else {
			System.err.println("짝수");
		}
		
		/*int score=88;
		char grade;
		
		if(score>=90) {
			grade='A';
		} else if(score>=80) {
			grade='B';
		} else if(score>=70) {
			grade='C';
		} else if(score>=60) {
			grade='D';
		} else {
			grade='F';
		}
		System.out.println("학점은 "+"'"+grade+"'");*/
		
		int i=3;
		if(i<=5) System.out.println("1번");
		else if(i<=4) System.out.println("2번");
		else if(i<=3) System.out.println("3번");
		else if(i<=2) System.out.println("4번");
		else System.out.println("5번");
		
		System.out.println("\n================\n");
		
		if(i<=5) System.out.println("1번");
		if(i<=4) System.out.println("2번");
		if(i<=3) System.out.println("3번");
		if(i<=2) System.out.println("4번");
		else System.out.println("5번");
		
		System.out.println();

		
//		*오류수정
		int score=96;
		String grade;
		
		if(score>=96) grade="A+"; {
			if(score>=87) grade="A0";
			else grade="A-";
		}
//		else if(score>=86) grade="B+"; {
//			if(score>=77) grade="B0";
//			else grade="B-";
//		}
//		
//		else if(score>=76) grade="C+"; {
//			if(score>=67) grade="C0";
//			else grade="C-";
//		}
//		
//		else if(score>=66) grade="D+"; {
//			if(score==65) grade="D0";
//			else(score>=56) grade="D-";
//		}
//		else grade="F";
//		
//		
		System.out.println("학점은 "+"'"+grade+"'");
		
		
		System.out.println();

		
		int Score=100;
		String Grade;
		
		switch(Score/10) {
		case 10: case 9:
			if(Score%100==0)	Grade="A+";
			else if(Score%10>=6)	Grade="A+";
			else if(Score%10==5) Grade="A0";
			else Grade="A-"; break;
			
//		case 9: 
//			if(Score%10>=6)	Grade="A+";
//			else if(Score%10==5) Grade="A0";
//			else Grade="A-"; break;
			
		case 8: 
			if(Score%10>=6)	Grade="B+";
			else if(Score%10==5) Grade="B0";
			else Grade="B-"; break;
			
		case 7: 
			if(Score%10>=6)	Grade="C+";
			else if(Score%10==5) Grade="C0";
			else Grade="C-"; break;
			
		case 6: 
			if(Score%10>=6)	Grade="D+";
			else if(Score%10==5) Grade="D0";
			else Grade="D-"; break;
			
		default: Grade="F";
		}
		System.out.println("학점은 "+Grade);
		System.out.println();

		/*1월, 3월, 5월, 7월, 8월, 10월, 12월 - 31일
		 *4월, 6월, 9월, 11월 - 30일
		 *2월 년도를 4로 나누어서 나머지가 0이면 29일, 0이 아니면 - 28일 */
		
		int mon=13, year=2022;
		String day;
		
		if (mon==4 || mon==6 || mon==9 || mon==11) day="30";
		if (mon==4) day="30";
//		else if (mon==6) day="30";
//		else if (mon==9) day="30";
//		else if (mon==11) day="30";
		else if (mon>=13) day="0";
		else if (mon==2) {
			if(year%4==0) day="29";
			else day="28";
		}
		else day="31";
		
		System.out.println(mon+"월의 일수는 "+day+"일 입니다.");
		
		System.out.println();

		
		int smon=12, syear=2022;
		int sday;
		
		switch(smon) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: sday=31; break;
		case 2: if(syear%4==0) sday=29;
				else sday=28; break;
		case 4: case 6: case 9: case 11: sday=30; break;
		default : sday=0;
		}
		System.out.println(smon+"월의 일수는 "+sday+"일 입니다.");
		System.out.println();

		
		int id=1111;
		int pw=2222;
		
		/*만약 아이디가 abc이고 비밀번호가 abc123인 경우에는 로그인 처리
		아니면 입력값이 잘못되었습니다. 라고 처리할것*/
		
//		if(id==1111 && pw==2222) {
//			System.out.println("로그인 되었습니다.");
//		}else {
//			System.out.println("입력값이 잘못 되었습니다.");
//		}
		
		if(id==1111 && pw==2222) System.out.println("로그인 되었습니다.");
		else if(pw!=2222 && id!=1111)
			System.out.println("회원정보가 잘 못 되었습니다.");
		else  
		{
				if(pw!=2222)
				System.out.println("비밀번호를 확인해주세요.");
				else System.out.println("아이디를 확인해주세요.");
			}
		System.out.println();

		int X=10, Y=10;
		int Z=X;
		System.out.println(X+", "+Y+", "+Z);
		
		Z=++X+(X+Y);
		System.out.println(X+", "+Y+", "+Z);

		Z=(X+Y)+ ++X;
		System.out.println(X+", "+Y+", "+Z);
		
		System.out.println();

		
		int value1=3;
		int value2=5;

		//논리연산 논리곱(=AND =&&) 전위연산자 우선순위 무시
		System.out.println("논리연산 논리곱 &&");
		System.out.println(false && ++value1 > 6);
		System.out.println(value1);
		System.out.println(true && ++value1 > 6);
		System.out.println(value1);
		System.out.println("===============\n");
		
		
		//논리연산 논리합 (=OR =||) 후위연산자 우선순위 무시
		System.out.println("논리연산 논리합 ||");
		System.out.println(true || value2++ > 6);
		System.out.println(value2);
		System.out.println(false || value2++ > 6);
		System.out.println(value2);
		System.out.println("===============\n");
		
		System.out.println();

		/*입력한 달이 3월~8월까지이면 "1학기" 를 출력하세요.
		 *입력한 달이 3월~8월까지가 아니면 "2학기"를 출력하세요.*/
		
		
		int M=3;
		String school;
		
		if (M==3||M==4||M==5||M==6||M==7||M==8) school="\"1학기\"";
		else school="\"2학기\"";		
		System.out.println(school);
		
		int MON=2, hak=1;
		
		if(MON>=3&&MON<=8) hak=1;
		else hak=2;
		System.out.println(hak+"학기 성적은 A 입니다.");
		System.out.println();
		
		String s="C"; String Str;
		switch(s) {
		case "A" : Str="1"; System.out.println(Str);
		case "B" : Str="2"; System.out.println(Str);
		case "C" : Str="3"; System.out.println(Str);
		case "D" : Str="4"; System.out.println(Str);
		case "E" : Str="5"; System.out.println(Str);
		default : Str="6"; System.out.println(Str);
		//상기 switch문은 break;가 없으므로 출력값이 3이 아니라 3,4,5,6으로 출력됨
		}
		
		
		//3점 미만 학생 명단 출력하기
		//[박희동 또치 마이콜]
		int I=3;
		String STR="";
		switch(I) {
		case 5 : STR+="고길동 "; break;
		case 4 : STR+="도우넛 "; break;
		case 3 : STR+="둘리 "; 
		case 2 : STR="박희동 "; 
		case 1 : STR+="또치 "; 
		default : STR += "마이콜 "; 
		}
		System.out.println(STR);
		
	}

}