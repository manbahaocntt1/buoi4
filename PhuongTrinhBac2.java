package buoi4;
import java.util.Scanner;
public class PhuongTrinhBac2 {
		private double a;
	    private double b;
	    private double c;
	    public void Input()
	    {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhap a= ");
	        a = scanner.nextDouble();
	        System.out.print("Nhap b= ");
	        b = scanner.nextDouble();
	        System.out.print("Nhap c= ");
	        c = scanner.nextDouble();
	    }
	    public void Output()
	    {

	        System.out.println(a+"x^2+ "+b+"x+ "+c);
	        
	    }

	    public void timNghiem()
	    {
	        double delta, x1,x2;
	        delta = (b*b)-4*a*c;
	        if(delta>0)
	        {
	            System.out.println("\nPhuong trinh co 2 nghiem phan biet");
	            x1=(-b+Math.sqrt(delta))/(2*a);
	            x2=(-b-Math.sqrt(delta))/(2*a);
	            System.out.print("x1= "+x1+"  x2= "+x2);
	           
	        }
	        else if (delta==0)
	        {
	            System.out.println("Phuong trinh co nghiem kep");
	            System.out.println("Nghiem la: "+ -b/(2*a));
	        }
	        else
	        {
	            System.out.println("Phuong trinh vo nghiem");
	        }
	    }
	public static void main(String[] args) {
		PhuongTrinhBac2 PtBac2a = new PhuongTrinhBac2();
        PtBac2a.Input();
        PtBac2a.Output();
        PtBac2a.timNghiem();

	}

}
