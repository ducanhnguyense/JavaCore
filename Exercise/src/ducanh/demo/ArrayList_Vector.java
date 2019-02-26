package ducanh.demo;

import java.util.ArrayList;
import java.util.Vector;

public class ArrayList_Vector {

	public static void main(String[] args) {
		ArrayList arrList = new ArrayList();
		arrList.add("Study");
		arrList.add(new String("StudyandShare"));
		arrList.add(new Integer(7));
		arrList.add(new Long(10));
		System.out.println(arrList.get(1));
		System.out.println(arrList.get(3));
		arrList.remove(3);
		Object[] array = arrList.toArray();
		System.out.println(array.length + " " + arrList.size());

		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}

		// Vector
		Vector vector = new Vector();

	}

}
