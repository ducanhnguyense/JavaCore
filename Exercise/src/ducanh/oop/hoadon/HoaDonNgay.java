package ducanh.oop.hoadon;

import java.time.LocalDate;

public class HoaDonNgay extends HoaDon {
	int songaythue;
	// trangthai=32 la so ngay thue sai

	public HoaDonNgay(String mahd, LocalDate ngayhd, String tenkh, String maphong, Double dongia, int songaythue) {
		super(mahd, ngayhd, tenkh, maphong, dongia);
		if (setSongaythue(songaythue) == false)
			trangthai += 32;
	}

	public HoaDonNgay(HoaDon hoadon, int songaythue) {
		super(hoadon.getMahd(), hoadon.getNgayhd(), hoadon.getTenkh(), hoadon.getMaphong(), hoadon.getDongia());
		if (setSongaythue(songaythue) == false)
			trangthai += 32;
	}

	public int getSongaythue() {
		return songaythue;
	}

	public boolean setSongaythue(int songaythue) {
		if (songaythue > 0) {
			this.songaythue = songaythue;
			return true;
		}
		return false;
	}

	public double thanhtien() {
		if (songaythue > 7)
			return songaythue * dongia * 0.8;
		else
			return songaythue * dongia;
	}

	@Override
	public String toString() {
		return "HoaDonNgay [" + super.toString() + "So ngay thue= " + songaythue + ", " + "Thanh tien" + thanhtien()
				+ "]";
	}

}
