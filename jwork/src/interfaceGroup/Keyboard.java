package interfaceGroup;

public class Keyboard extends ModuleImp1 {
	// 전원 온/오프, 키누름/눌렀다 뗌
	Keyboard(){
		System.out.println("Keyboaard기능을 시작합니다.");
	}
	
	public void powerOn() {
		super.powerOn();
	}
	
	public void powerOff() {
		super.powerOff();
	}
	
	public void keyPress() {
		super.keyPress();
	}
	
	public void keyClick() {
	super.keyClick();
	}
}
