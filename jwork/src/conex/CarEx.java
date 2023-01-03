package conex;

public class CarEx {
	public static void main(String [] args) {
		Car C1=new Car();
		C1.kind="벨로스터";
		C1.year=3;
		C1.km=3000;
		System.out.printf("차종: %s, 년식: %d년, 주행거리: %,dkm",C1.getKind(),C1.getYear(),C1.getKm());
	}
}

class Car {
	String kind;
	int year;
	int km;
	
	public void carmd(String kind,int year,int km) {
		this.kind=kind;
		this.year=year;
		this.km=km;
	}
	
	String getKind() {
		return kind;
	}
	int getYear() {
		return year;
	}
	int getKm() {
		return km;
	}

}