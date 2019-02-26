package ducanh.demo;

import java.util.Vector;

public class GenericExample2 {

	public static void main(String[] args) {
		Vector<C> vector = new Vector<C>();
		vector.add(new C());
		vector.add(new C());
		vector.add(new D());
		
		Vector<D> vector1 = new Vector<D>();
		vector1.add(new D());
		
	}
}
class C{
	
}
class D extends C{
	
}

