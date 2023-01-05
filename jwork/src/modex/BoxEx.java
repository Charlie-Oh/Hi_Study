package modex;

class Box{
	long idNum;
	static long boxID=0;
//	long boxID=0;
	
	public Box() {
		idNum=boxID++;
	}
}

public class BoxEx {

	public static void main(String[] args) {
		Box box1=new Box();
		Box box2=new Box();
		Box box3=new Box();
		Box box4=new Box();
		System.out.println("box1의 idNum : "+box1.idNum);
		System.out.println("box2의 idNum : "+box2.idNum);
		System.out.println("box3의 idNum : "+box3.idNum);
		System.out.println("box4의 idNum : "+box4.idNum);
		System.out.println("박스 총 개수 : "+Box.boxID);
//		System.out.println("static이 없을때 boxID는 : "+box1.boxID);
//		System.out.println("static이 없을때 boxID는 : "+box2.boxID);
//		System.out.println("static이 없을때 boxID는 : "+box3.boxID);
//		System.out.println("static이 없을때 boxID는 : "+box4.boxID);

	}

}
