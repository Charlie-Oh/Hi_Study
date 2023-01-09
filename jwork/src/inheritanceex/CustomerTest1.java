package inheritanceex;

public class CustomerTest1 {

	public static void main(String[] args) {
//		Customer customerLee = new Customer(10010, "이순신");
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		//이순신 님의 등급은 SILVER 이며, 보너스 포인트는 1000입니다.
//		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김유신");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}//김유신 님의 등급은 VIP 이며, 보너스 포인트는 10000입니다.
}