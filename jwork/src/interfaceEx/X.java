package interfaceEx;

public interface X {
	void xmeth1();
	void xmeth2();
}

interface Y {
	void ymeth1();
}

interface Z extends X, Y { // 두 개의 인터페이스 상속
	void zmeth1();
}
