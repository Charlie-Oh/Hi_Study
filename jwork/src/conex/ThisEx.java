package conex;

class This{
	int num=1; String str="한글";
	
	public void setNum(int num, String str) {
		this.num=num; this.str=str;
	}
	
	public int getNum() {
		return num;
	}
	
	public int getNum(int j) {
		this.num=num*j;
		return num;
	}
	
	public void amd() {
		int num=5; int str=7;
		if(num<=5) {
			//int num=3;
			System.out.println("this.num는 "+this.num);
			//String str="wow";
			System.out.println("this.str는 "+this.str);
		}
		System.out.println("num는 "+num);
		System.out.println("str는 "+str);
		System.out.println();
	}
	
}

public class ThisEx {
	public static void main(String[] args) {
		This a=new This();
		a.amd();
		a.setNum(2, "테스트");
		a.amd();
		int x=a.getNum();
		System.out.println(x);
		int y=a.getNum(5);
		System.out.println(y);
	}
}

