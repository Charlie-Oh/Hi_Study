package modex;

class Account{
	int count;
	static int total;
	
	Account(int amount){
		count+=amount;
		total+=amount;
	}
}

public class AccountEx {
	public static void main(String[] args) {
		System.out.println("Account.total : "+Account.total);//0
		
		Account acc01=new Account(10);
		System.out.println("acc01.total : "+acc01.total);//10
		System.out.println("acc01.count : "+acc01.count);//10
		
		Account acc02=new Account(10);
		System.out.println("acc02.total : "+acc02.total);//20
		System.out.println("acc02.count : "+acc02.count);//10
		
		Account acc03=new Account(10);
		System.out.println("acc03.total : "+acc03.total);//30
		System.out.println("acc03.count : "+acc03.count);//10
	}
}
