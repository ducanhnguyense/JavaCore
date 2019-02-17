package ducanh.oop;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		BookList dsSach = new BookList(20);
		int count, chon;
		Book sach;
		do {
			chon = ChonMenu();
			switch (chon) {
			case 1:
				sach = TaoSach(1);
				if (ThemSach(sach, dsSach) == false)
					System.out.println("Them khong thanh cong SGK");
				else
					System.out.println("Them SGK thanh cong");
				break;

			}
		} while (chon < 7);
	}

	public static int ChonMenu() {
		System.out.println("\t\t=======Menu=======\n");
		System.out.println("1. Them SGK.");
		System.out.println("2. Them sach tham khao.");
		System.out.println("3. Xuat DS SGK.");
		System.out.println("4. Xuat DS sach tham khao.");
		System.out.println("5. Trung binh don gia sach tham khao.");
		System.out.println("6. Thoat");
		System.out.print("Ban hay chon mot trong nhung yeu cau tren: ");
		Scanner sc = new Scanner(System.in);
		int chon = sc.nextInt();
		return chon;
	}

	public static boolean ThemSach(Book sach, BookList dsSach) {
		return dsSach.themsach(sach);
	}

	public static Book TaoSach(int loai) {
		Scanner sc = new Scanner(System.in);
		String masach, nxb, tinhtrang;
		LocalDate ngaynhap;
		double dongia, thue;
		int trangthai = 0, soluong;
		SachGiaoKhoa SGK = null;
		SachThamKhao STK = null;
		do {
			sc.nextLine();
			System.out.print("Nhap ma sach: ");
			masach = sc.nextLine();
			System.out.println("Nhap nha xuat ban: ");
			nxb = sc.nextLine();
			System.out.println("Nhap don gia cua sach: ");
			dongia = sc.nextDouble();
			System.out.println("Nhap so luong sach: ");
			soluong = sc.nextInt();
			System.out.println("Nhap ngay nhap sach (dd/MM/yyyy): ");
			String ngay = sc.nextLine();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			ngaynhap = LocalDate.parse(ngay, formatter);
			if (loai == 1) {
				System.out.print("Nhap vao tinh trang SGK: ");
				tinhtrang = sc.nextLine();
				SGK = new SachGiaoKhoa(masach, ngaynhap, nxb, dongia, soluong, tinhtrang);
				trangthai = SGK.getTrangthai();
			} else {
				System.out.println("Nhao vao trang thai STK: ");
				thue = sc.nextDouble();
				STK = new SachThamKhao(masach, ngaynhap, nxb, dongia, soluong, thue);
				trangthai = STK.getTrangthai();
			}
			if (trangthai != 0)
				Loi(trangthai);
		} while (trangthai > 0);
		return (loai == 1 ? SGK : STK);
	}

	public static void Loi(int trangthai) {
		if ((trangthai & 1) == 1)
			System.out.println("Ma sach khong hop le");
		if ((trangthai & 2) == 2)
			System.out.println("Nha xuat ban khong hop le");
		if ((trangthai & 4) == 4)
			System.out.println("So luong sach khong hop le");
		if ((trangthai & 8) == 8)
			System.out.println("Ngay nhap sach khong hop le");
		if ((trangthai & 16) == 16)
			System.out.println("Don gia sach khong hop le");
		if ((trangthai & 32) == 32)
			System.out.println("Tinh trang cua SGK khong hop le");
		if ((trangthai & 64) == 64)
			System.out.println("Tinh trang sach tham khao khong hop le");
	}
}
