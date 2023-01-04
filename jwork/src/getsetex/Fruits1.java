package getsetex;

public class Fruits1 {
	private int apple;
	private int straw;
	private int grapes;
	private int sum;
	
	Fruits1(int apple, int straw, int grapes){
		this.apple=apple;
		this.straw=straw;
		this.grapes=grapes;
		count();
	}
	
	private void count() {
	sum=apple+straw+grapes;
	}
	public int gettotal() {
		return sum;
	}
	
	public void setApple(int apple) {
		this.apple=apple;
	}
	public void setStraw(int straw) {
		this.straw=straw;
	}
	public void setGrapes(int grapes) {
		this.grapes=grapes;
	}
	public void setSum(int sum) {
		this.sum=sum;		
	}
	
	public int getApple() {
		return apple;
	}
	
	public int getStraw() {
		return straw;
	}
	
	public int getGrapes() {
		return grapes;
	}
	
	public int getSum() {
		return sum;
	}
		
}
