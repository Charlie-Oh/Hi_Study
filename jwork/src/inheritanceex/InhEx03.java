package inheritanceex;

class Parent{
	
}

class Child extends Parent{
	
}

class Brother extends Parent{
	
}

public class InhEx03 {
	public static void main(String[] args) {
		Parent p=new Parent();
		System.out.println("1번. "+(p instanceof Object));
		System.out.println("2번. "+(p instanceof Parent));
		System.out.println("3번. "+(p instanceof Child));
		System.out.println();
		
		Parent c=new Child();
		System.out.println("4번. "+(c instanceof Object));
		System.out.println("5번. "+(c instanceof Parent));
		System.out.println("6번. "+(c instanceof Child));
		System.out.println();
		
		Parent b=new Brother();
		System.out.println("7번. "+(b instanceof Object));
		System.out.println("8번. "+(b instanceof Parent));
		System.out.println("9번. "+(b instanceof Child));
	}
}
