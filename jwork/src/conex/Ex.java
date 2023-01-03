package conex;

public class Ex {
	public static void main(String[] args) {
		Ex1 e1=new Ex1();
		e1.Green="Green";
		e1.Yellow="Yellow";
		e1.Red="Red";
		int i=(int)(Math.random()*10000)%10;
		if(i>3) {
		System.out.println(e1.Green);
		}
		else if(i>6) {
		System.out.println(e1.Yellow);
		}
		else System.out.println(e1.Red);
		
	}
}


class Ex1{
	String Green;
	String Yellow;
	String Red;
	
	void color(String Green, String Yellow, String Red){
		this.Green=Green;
		this.Yellow=Yellow;
		this.Red=Red;
	}
	
	String getG() {
		return Green;
	}
	
	String getY() {
		return Yellow;
	}
	
	String getR() {
		return Red;
	}
}
