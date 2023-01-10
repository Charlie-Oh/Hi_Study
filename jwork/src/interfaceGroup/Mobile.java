package interfaceGroup;
//public class Mobile {
public class Mobile extends ModuleImp1 {
	//전원 온/오프/재시작, 볼륨 업/다운, 밝기 업/다운
	ModuleImp1 m=new ModuleImp1();
	
	Mobile(){
		System.out.println("Moblie기능을 시작합니다.");
	}
	
	public void powerOn() {
		m.powerOn();
	}
	public void powerOff() {
		m.powerOff();
	}
	public void powerRestart() {
		m.powerRestart();
	}
	
	public void volumnUp() {
		m.volumnUp();
	}
	public void volumnDown() {
		m.volumnDown();
	}
	
	public void lightUp() {
		m.lightUp();
	}
	public void lightDown() {
		m.lightDown();
	}
}
