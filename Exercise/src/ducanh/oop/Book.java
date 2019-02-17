package ducanh.oop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public abstract class Book {
	protected String masach, nxb;
	protected LocalDate ngaynhap;
	protected double dongia;
	protected int soluong;
	protected int trangthai = 0;

	// Cac phuong thuc Book

	public Book(String masach) {
		trangthai = 0;
		if (masach.length() > 0)
			this.masach = masach;
		else
			trangthai += 1;
	}

	public Book(String masach, LocalDate ngaynhap, String nxb, Double dongia, int soluong) {
		super();
		trangthai = 0;
		if (masach.length() > 0)
			this.masach = masach;
		else
			trangthai += 1;
		if (setNgaynhap(ngaynhap) == false)
			trangthai += 8;
		if (setNxb(nxb) == false)
			trangthai += 2;
		if (setSoluong(soluong) == false)
			trangthai += 4;
		if (setDongia(dongia) == false)
			trangthai += 16;
	}

	public Book(Book book) {
		super();
		trangthai = 0;
		if (book.getMasach().length() > 0)
			this.masach = book.getMasach();
		else
			trangthai += 1;
		if (setNgaynhap(book.getNgaynhap()) == false)
			trangthai += 8;
		if (setNxb(book.getNxb()) == false)
			trangthai += 2;
		if (setSoluong(book.getSoluong()) == false)
			trangthai += 4;
		if (setDongia(book.getDongia()) == false)
			trangthai += 16;
	}

	// Cac phuong thuc get va set

	public LocalDate getNgaynhap() {
		return ngaynhap;
	}

	public boolean setNgaynhap(LocalDate ngaynhap) {
		LocalDate curDay = LocalDate.now();
		if (ngaynhap.compareTo(curDay) == 0) {
			this.ngaynhap = ngaynhap;
			return true;
		}
		this.ngaynhap = curDay;
		return false;
	}

	public String getMasach() {
		return masach;
	}

	public boolean setMasach(String masach) {
		if (masach.length() > 0) {
			this.masach = masach;
			return true;
		}
		return false;
	}

	public String getNxb() {
		return nxb;
	}

	public boolean setNxb(String nxb) {
		if (nxb.length() > 0) {
			this.nxb = nxb;
			return true;
		}
		return false;
	}

	public double getDongia() {
		return dongia;
	}

	public boolean setDongia(double dongia) {
		if (dongia > 0) {
			this.dongia = dongia;
			return true;
		}
		return false;
	}

	public int getSoluong() {
		return soluong;
	}

	public boolean setSoluong(int soluong) {
		if (soluong > 0) {
			this.soluong = soluong;
			return true;
		}
		return false;
	}

	public int getTrangthai() {
		return trangthai;
	}

	public abstract double thanhtien();

	@Override
	public String toString() {
		Locale local = new Locale("vi", "VN");
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", local);
		return "Book [Ma sach=" + masach + ", Nha Xuat Ban" + nxb + ", Ngay nhap=" + ngaynhap + ", Don gia=" + dongia
				+ ", So luong=" + soluong + "Ngay nhap: " + ngaynhap.format(formatter) + "]";
	}

}
