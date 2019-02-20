package ducanh.oop.hoadon;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HoaDonTest {

	public static void main(String[] args) {
		DanhSachHD dshd = new DanhSachHD(20);
		int chon;
		HoaDon hd;
		do {
			chon = menu();
			switch (chon) {
			case 1:
				hd = taoHD(1);
				if (ThemHD(hd, dshd) == false)
					System.out.println("Them hoa don khong thanh cong");
				else
					System.out.println("Them hoa don thanh cong");
				break;
			case 2:
				hd = taoHD(2);
				if (ThemHD(hd, dshd) == false)
					System.out.println("Them hoa don khong thanh cong");
			case 3:
				System.out.println(dshd.dsHoaDonNgay());
				break;
			case 4:
				System.out.println(dshd.dsHoaDonGio());
				break;
			}
		} while (chon < 5);
	}

	public static int menu() {
		System.out.println("1. Them hoa don ngay.");
		System.out.println("2. Them hoa don gio.");
		System.out.println("3. In danh sach hoa don ngay.");
		System.out.println("4. In danh sach hoa don gio.");
		System.out.println("5. Ket thuc.");
		System.out.println("Ban hay nhap yeu cau :");
		Scanner sc = new Scanner(System.in);
		int chon = sc.nextInt();
		return chon;
	}

	public static boolean ThemHD(HoaDon hd, DanhSachHD dshd) {
		return dshd.themHD(hd);
	}

	public static HoaDon taoHD(int loai) {
		Scanner sc = new Scanner(System.in);
		String mahd, tenkh, maphong;
		LocalDate ngayhd;
		int songaythue, sogiothue, trangthai = 0;
		double dongia;
		HoaDonNgay hdngay = null;
		HoaDonGio hdgio = null;
		do {
			sc.nextLine();
			System.out.print("Nhap ma hoa don: ");
			mahd = sc.nextLine();
			System.out.print("Nhap ten khach hang: ");
			tenkh = sc.nextLine();
			System.out.print("Nhap ma phong: ");
			maphong = sc.nextLine();
			System.out.print("Nhap don gia: ");
			dongia = sc.nextDouble();
			sc.nextLine();
			System.out.print("Nhap ngay lap hoa don: dd/mm/yyyy");
			String ngay = sc.nextLine();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			ngayhd = LocalDate.parse(ngay, formatter);
			if (loai == 1) {
				System.out.println("Nhap so ngay thue: ");
				songaythue = sc.nextInt();
				hdngay = new HoaDonNgay(mahd, ngayhd, tenkh, maphong, dongia, songaythue);
				trangthai = hdngay.getTrangthai();
			} else {
				System.out.println("Nhap so gio thue: ");
				sogiothue = sc.nextInt();
				hdgio = new HoaDonGio(mahd, ngayhd, tenkh, maphong, dongia, sogiothue);
				trangthai = hdgio.getTrangthai();
			}
			if (trangthai != 0)
				xuat_loi(trangthai);
		} while (trangthai > 0);
		return (loai == 1 ? hdngay : hdgio);
	}

	public static void xuat_loi(int trangthai) {
		if ((trangthai & 1) == 1)
			System.out.println("Ma hoa don khong hop le");
		if ((trangthai & 2) == 2)
			System.out.println("Ten khach hang khong hop le");
		if ((trangthai & 4) == 4)
			System.out.println("Ma phong khong hop le");
		if ((trangthai & 8) == 8)
			System.out.println("Ngay lap hoa don khong hop le");
		if ((trangthai & 16) == 16)
			System.out.println("Don gia khong hop le");
		if ((trangthai & 32) == 32)
			System.out.println("So ngay thue khong hop le");
		if ((trangthai & 64) == 64)
			System.out.println("So gio thue khong hop le");
	}
}
