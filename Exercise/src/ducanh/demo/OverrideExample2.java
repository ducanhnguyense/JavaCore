package ducanh.demo;

public class OverrideExample2 extends TutorialOverride2{

	public int increate(int a) {
		return a + 7;
	}
	public static void main(String[] args) {
		
	}
//	public TutorialOveride1 create() {
//		return new TutorialOverride1();
//	}
}

class TutorialOverride2{
	public int increase(int a) {
		return a + 5;
	}
	
//	public TutorialOveride1 create() {
//		return new TutorialOverride1();
//	}
}
