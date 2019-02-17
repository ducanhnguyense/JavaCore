package ducanh.oop;

import java.time.LocalDate;

public class SachThamKhao extends Book {
	double thue;

	// trangthai +=64; la trang thai sai

	public SachThamKhao(String masach, LocalDate ngaynhap, String nxb, double dongia, int soluong, double thue) {
		super(masach, ngaynhap, nxb, dongia, soluong);
		if (setThue(thue) == false)
			trangthai += 64;
	}

	public SachThamKhao(Book book, double thue) {
		super(book.getMasach(), book.getNgaynhap(), book.getNxb(), book.getDongia(), book.getSoluong());
		if (setThue(thue) == false)
			trangthai += 64;
	}

	public double getThue() {
		return thue;
	}

	public boolean setThue(double thue) {
		if (thue > 0) {
			this.thue = thue;
			return true;
		}
		this.thue = 0.0;
		return false;
	}

	public double thanhtien() {
		return soluong * dongia + thue;
	}

	@Override
	public String toString() {
		return "SachThamKhao [" + super.toString() + "Tien thue= " + thue + "Thanh tien=" + thanhtien() + "]";
	}

}
