package ducanh.demo;

import java.io.IOException;

public class OverrideExample2 extends TutorialOverride2{

	public int increate(int a) {
		return a + 7;
	}
	public static void main(String[] args) {
		
	}
	public TutorialOverride create() {
		return new TutorialOverride();
	}
}

class TutorialOverride2{
	public int increase(int a) {
		return a + 5;
	}
	
	public TutorialOverride create() throws IOException{
		return new TutorialOverride();
	}
}
