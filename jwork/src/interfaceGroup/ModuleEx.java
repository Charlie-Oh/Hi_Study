package interfaceGroup;

public class ModuleEx {
	public static void main(String[] args) {
		Module m=new TV();
		m.powerOn();
		m.volumnUp();
		m.volumnDown();
		m.lightUp();
		m.lightDown();
		m.powerOff();
		System.out.println();
		
		m=new Radio();
		m.powerOn();
		m.volumnUp();
		m.volumnDown();
		m.powerOff();
		System.out.println();
		
		m=new Keyboard();
		m.powerOn();
		m.keyPress();
		m.keyClick();
		m.powerOff();
		System.out.println();
		
		m=new Mobile();
		m.powerOn();
		m.volumnUp();
		m.volumnDown();
		m.lightUp();
		m.lightDown();
		m.powerRestart();
		m.powerOff();
		System.out.println();
	}
}
