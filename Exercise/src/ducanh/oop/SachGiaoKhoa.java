package ducanh.oop;

import java.time.LocalDate;

public class SachGiaoKhoa extends Book {

	String tinhtrang;

	// trangthai = 32 thi tinh trang sai

	public SachGiaoKhoa(String masach, LocalDate ngaynhap, String nxb, double dongia, int soluong, String tinhtrang) {
		super(masach, ngaynhap, nxb, dongia, soluong);
		if (setTinhtrang(tinhtrang) == false)
			trangthai += 32;
	}

	public SachGiaoKhoa(Book book, String tinhtrang) {
		super(book.getMasach(), book.getNgaynhap(), book.getNxb(), book.getDongia(), book.getSoluong());
		if (setTinhtrang(tinhtrang) == false)
			trangthai += 32;
	}

	public String getTinhtrang() {
		return tinhtrang;
	}

	public boolean setTinhtrang(String tinhtrang) {
		if (tinhtrang.length() > 0) {
			this.tinhtrang = tinhtrang;
			return true;
		}
		return false;
	}

	public double thanhtien() {
		if (tinhtrang.compareTo("moi") == 0)
			return soluong * dongia;
		if (tinhtrang.compareTo("cu") == 0)
			return soluong * dongia * 0.5;
		return 0.0;
	}

	@Override
	public String toString() {
		return "SachGiaoKhoa [" + super.toString() + "Tinh trang : " + tinhtrang + "Thanh tien" + thanhtien() + "]";
	}

}
