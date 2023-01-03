package conex;

public class Point06Ex {
	public static void main(String[] args) {
		/*1.Point06으로 객체생성문 작성하여 x, y의 멤버변수 값을 각각, 5와 3으로 변경
		 *2.Point06으로 생성한 객체를 통해 showPoint()메소드를 호출 */
		
		Point06 pt6=new Point06();
		pt6.x=5;
		pt6.y=3;
		
		pt6.showPoint();
		
	}
}

class Point06 {
	int x;
	int y;

	public Point06() {
		System.out.println("매개 변수가 없는 디폴트 생성자");
	}
	
	public void showPoint() {
		System.out.println(x+", "+y);
		
	}
	
}