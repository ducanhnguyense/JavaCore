package ducanh.oop;

public class BookList {
	private Book[] booklist;
	Book sach;
	int count;

	public BookList(int x) {
		if (x > 0)
			booklist = new Book[x];
		else
			booklist = new Book[10];
	}

	public int getCount() {
		return count;
	}

	public boolean themsach(Book sach) {
		if (count < booklist.length) {
			booklist[count] = sach;
			count++;
			return true;
		}
		return false;
	}

	public double tbDonGiaSTK() {
		int dem = 0, tong = 0;
		for (int i = 0; i < count; i++) {
			if (booklist[i] instanceof SachThamKhao) {
				dem++;
				tong += booklist[i].dongia;
				return tong / dem;
			}
		}
		return 0.0;
	}

	public String XuatNXB(String x) {
		String danhsach = "";
		for (int i = 0; i < count; i++) {
			if (booklist[i].nxb.compareTo(x) == 0) {
				danhsach += booklist[i].toString() + "\n ";
			}
		}
		return danhsach;
	}
}
