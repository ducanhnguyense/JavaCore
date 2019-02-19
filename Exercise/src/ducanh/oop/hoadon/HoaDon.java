package ducanh.oop.hoadon;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class HoaDon {
	protected String mahd, tenkh, maphong;
	protected LocalDate ngayhd;
	protected Double dongia;
	protected int trangthai;

	public HoaDon(String mahd) {
		trangthai = 0;
		if (mahd.length() > 0)
			this.mahd = mahd;
		else
			trangthai += 1;
	}

	public HoaDon(String mahd, LocalDate ngayhd, String tenkh, String maphong, Double dongia) {
		super();
		trangthai = 0;
		if (mahd.length() > 0)
			this.mahd = mahd;
		else
			trangthai += 1;
		if (setNgayhd(ngayhd) == false)
			trangthai += 8;
		if (setTenkh(tenkh) == false)
			trangthai += 2;
		if (setMaphong(mahd) == false)
			trangthai += 4;
		if (setDongia(dongia) == false)
			trangthai += 16;
	}

	public HoaDon(HoaDon hoadon) {
		super();
		trangthai = 0;
		if (hoadon.getMahd().length() > 0)
			this.mahd = hoadon.getMahd();
		else
			trangthai += 1;
		if (setNgayhd(hoadon.getNgayhd()) == false)
			trangthai += 8;
		if (setTenkh(hoadon.getTenkh()) == false)
			trangthai += 2;
		if (setMaphong(hoadon.getMaphong()) == false)
			trangthai += 4;
		if (setDongia(hoadon.getDongia()) == false)
			trangthai += 16;
	}

	public LocalDate getNgayhd() {
		return ngayhd;
	}

	public boolean setNgayhd(LocalDate ngayhd) {
		LocalDate curDay = LocalDate.now();
		if (ngayhd.compareTo(curDay) == 0) {
			this.ngayhd = ngayhd;
			return true;
		}
		this.ngayhd = curDay;
		return false;
	}

	public String getMahd() {
		return mahd;
	}

	public boolean setMahd(String mahd) {
		if (mahd.length() > 0) {
			this.mahd = mahd;
			return true;
		}
		return false;
	}

	public String getTenkh() {
		return tenkh;
	}

	public boolean setTenkh(String tenkh) {
		if (tenkh.length() > 0) {
			this.tenkh = tenkh;
			return true;
		}
		return false;
	}

	public String getMaphong() {
		return maphong;
	}

	public boolean setMaphong(String maphong) {
		if (maphong.length() > 0) {
			this.maphong = maphong;
			return true;
		}
		this.maphong = "p000";
		return false;
	}

	public Double getDongia() {
		return dongia;
	}

	public boolean setDongia(Double dongia) {
		if (dongia > 0) {
			this.dongia = dongia;
			return true;
		}
		this.dongia = 0.0;
		return false;
	}

	public int getTrangthai() {
		return trangthai;
	}

	@Override
	public String toString() {
		Locale local = new Locale("vi", "VN");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", local);
		return "HoaDon [mahd=" + mahd + ", tenkh=" + tenkh + ", maphong=" + maphong + ", ngayhd="
				+ ngayhd.format(formatter) + ", dongia=" + dongia + "]";
	}
}