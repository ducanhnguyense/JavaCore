package ducanh.oop.hoadon;
import java.time.*;

public class DanhSachHD 
{
	private HoaDon[] dsHD;
	int count;
	HoaDon hd;
	
	public DanhSachHD (int x)
	{
		if (x>0)
			dsHD =new HoaDon[x];
		else 
			dsHD =new HoaDon[10];
	}
	
	public boolean themHD (HoaDon hd)
	{
		if (count<dsHD.length)
		{
			dsHD[count]=hd;;
			count++;
			return true;
		}
		return false;
	}
	
	public int getCount ()
	{
		return count;
	}
	
	public int demHoadonngay ()
	{
		int dem=0;
		for (int i=0;i<count;i++)
			if (dsHD[i] instanceof HoaDonNgay)
				dem++;
		return dem;
	}
	
	public int demHoadongio ()
	{
		int dem=0;
		for (int i=0;i<count;i++)
			if (dsHD[i] instanceof HoaDonGio)
				dem++;
		return dem;
	}
	
	public String dsHoaDonNgay ()
	{
		String danhsach="";
		for (int i=0;i<count;i++)
			if (dsHD[i] instanceof HoaDonNgay)
				danhsach += dsHD[i].toString() + "\n";
		return danhsach;
	}
	
	public String dsHoaDonGio ()
	{
		String danhsach="";
		for (int i=0;i<count;i++)
			if (dsHD[i] instanceof HoaDonGio)
				danhsach += dsHD[i].toString() + "\n";
		return danhsach;
	}

}
