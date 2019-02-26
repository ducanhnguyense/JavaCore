package ducanh.demo;

import java.util.ArrayList;
import java.util.HashMap;

public class GenericExample1 {

	public static void main(String[] args) {
		// Generic cho phep quan ly viec them va quan ly du lieu theo 1 kieu duy nhat
		// su dung duy nhat 1 loai doi tuong voi cac loai Collection ma khong can quan
		// tam den vi tri phan tu va no la loai gi
	}

	class A {
		public void show() {
			ArrayList<A> arrList = new ArrayList<A>();
			arrList.add(new A());
			arrList.add(new A());
			for (int i = 0; i < arrList.size(); i++) {
				arrList.get(i).show();
			}
			HashMap<String, B> map = new HashMap<String, B>();
			map.put("Michael", new B());
			map.put("blog", new B());
		}
	}

	class B {
		public void go() {

		}
	}
}
