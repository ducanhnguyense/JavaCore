package ducanh.oop.hoadon;

import java.time.LocalDate;

public class HoaDonGio extends HoaDon {
	int sogiothue;
	// trangthai = 64, la so gio thue duoc gan la  1

	public HoaDonGio(String mahd, LocalDate ngayhd, String tenkh, String maphong, Double dongia, int songaythue) {
		super(mahd, ngayhd, tenkh, maphong, dongia);
		if (setSogiothue(sogiothue) == false)
			trangthai += 32;
	}

	public HoaDonGio(HoaDon hoadon, int sogiothue) {
		super(hoadon.getMahd(), hoadon.getNgayhd(), hoadon.getTenkh(), hoadon.getMaphong(), hoadon.getDongia());
		if (setSogiothue(sogiothue) == false)
			trangthai += 32;
	}

	public int getSogiothue() {
		return sogiothue;
	}

	public boolean setSogiothue(int sogiothue) {
		if (sogiothue > 0 && sogiothue < 30) {
			this.sogiothue = sogiothue;
			return true;
		}
		this.sogiothue = 1;
		return false;
	}

	public double thanhtien() {
		if (sogiothue > 24 || sogiothue < 30)
			return 24 * dongia;
		else
			return sogiothue * dongia;
	}

	public String toString() {
		return "HoaDonGio [" + super.toString() + "So gio thue= " + sogiothue + ", " + "Thanh tien" + thanhtien() + "]";
	}
}
