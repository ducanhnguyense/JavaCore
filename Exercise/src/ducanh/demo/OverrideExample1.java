package ducanh.demo;

public class OverrideExample1 extends TutorialOverride{

	//Dac diem nhan dang override
	//La 2 phuong thuc cung ten, tham so giong nhau, kieu tra ve giong nhau, modifier giong nhau
	// Override khac Overload la Override DS tham so se giong, con Overload thi khong
	//Khi muon override phai khai bao modifier rong hon thi moi override duoc
	public static void main(String[] args) {
		OverrideExample1 override1 = new OverrideExample1();
		override1.show();
	}
	
	void show() {
		System.out.println("Show Override");
	}

}

class TutorialOverride{
	void show() {
		System.out.println("Show Tutorial Override");
	}
}