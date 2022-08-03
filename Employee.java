package buoi4;
import java.util.Scanner;
public class Employee {
	private String id;
    private String name;
    private int age;
    private int workingDays;
    double salary;
    int PRICE = 50;
    public Employee(){

    }
    public Employee(String id,String name, int age, int workingDays)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.workingDays = workingDays;
    }
    public String getId()
    {
        return id;
    }
    public void setId(String ids)
    {
        id = ids;
    }
    public String getName()
    {
         return name;
    }
    public void setName(String names)
    {
        name = names;
    }
    public Integer getAge()
    {
        return age;
    }
    public void setAge(int ages)
    {
        age = ages;
    }
    public Integer getWorkingDays()
    {
        return workingDays;
    }
    public void setWorkingDays(int workingDayss)
    {
        workingDays = workingDayss;
    }
    public void Input()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhap ma nhan vien: ");
        id = scanner.nextLine();
        System.out.print("Nhap ten nhan vien: ");
        name = scanner.nextLine();
        System.out.print("Nhap tuoi: ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap so ngay lam viec: ");
        workingDays = scanner.nextInt();
    }

    public void Output()
    {
        System.out.printf("%-15s%-15s%-15s%-15s\n","Id", "Name","Age","WorkingDays");
        System.out.printf("%-15s%-15s%-15d%-15d\n", id, name, age, workingDays);
    }
    public double salary()
    {
        return workingDays*PRICE;
    }
	public static void main(String[] args) {
        Employee a = new Employee();
        Employee b= new Employee("2022","Hao",19,1);
        b.Output();
        a.setId("2021600340");
        a.setName("Hao");
        a.setAge(19);
        a.setWorkingDays(20);
        System.out.println();
        a.Output();
        System.out.print("Salary= "+ a.salary());

        a.Input();
        a.Output();
        System.out.print("Salary= "+ a.salary());

	}

}
