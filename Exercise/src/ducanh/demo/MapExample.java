package ducanh.demo;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// su dung khi co 2 loai lien quan truc tiep den nhau nhung co 2 key khac nhau
		HashMap map = new HashMap();
		map.put("Beginner", "Michael");
		map.put("blog", "StudyAndShare");
		map.put(new Integer(5), "VietNam");
		map.put("blog", "Test");
		System.out.println(map.get("Beginner"));
		System.out.println(map.get("blog"));
		System.out.println(map.get("HCM"));
		System.out.println(map.size());
		map.remove("Beginner");
		System.out.println(map.get("Beginner"));
		map.clear();
		System.out.println("blog");
	}

}
