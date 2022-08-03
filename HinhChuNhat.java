package buoi4;
import java.util.Scanner;
public class HinhChuNhat {
	private int chieuDai;
    private int chieuRong;
    public void Input()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhap chieu dai: ");
        chieuDai = scanner.nextInt();
        System.out.print("Nhap chieu rong: ");
        chieuRong = scanner.nextInt();
    }
    public void Output()
    {
        int chuVi = chieuDai+chieuRong;
        int dienTich=chieuDai*chieuRong;
        System.out.printf("%-15d%-15d%-15d%-15d\n" , chieuDai, chieuRong, chuVi, dienTich);

    }
    public double dienTich()
    {
        return chieuDai*chieuRong;
    }
    public int getChieuDai()
    {
        return chieuDai;
    }
    public void setChieuDai(int chieuDais)
    {
        chieuDai = chieuDais;
    }

    public int getChieuRong()
    {
        return chieuRong;
    }
    public void setChieuRong(int chieuRongs)
    {
    chieuRong = chieuRongs;
    }
	public static void main(String[] args) {
		HinhChuNhat a = new HinhChuNhat();
	    HinhChuNhat b = new HinhChuNhat();

	    a.setChieuDai(15);
	    a.setChieuRong(8);
	    b.setChieuDai(20);
	    b.setChieuRong(3);
	    System.out.printf("%-15s%-15s%-15s%-15s\n","Chieu dai", "Chieu rong", "Chu vi", "Dien tich");
	    a.Output();
	    b.Output();
	    System.out.println();
	    a.Input();
	    b.Input();
	    System.out.printf("%-15s%-15s%-15s%-15s\n","Chieu dai", "Chieu rong", "Chu vi", "Dien tich");
	    a.Output();
	    b.Output();

	    if(a.dienTich() > b.dienTich())
	    {
	        System.out.println("hinh chu nhat co dien tich lon hon la hinh a " );
	    }
	    else
	    {
	        System.out.println("hinh chu nhat co dien tich lon hon la hinh b " );
	    }

	}

}
