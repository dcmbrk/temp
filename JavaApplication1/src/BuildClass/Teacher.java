package BuildClass;
import java.util.Scanner;

public class Teacher extends Person
{
    private String className;
    private double salaryPerHour;
    private int hoursInMonth;
    
    public Teacher()
    {
        super();
    }
    
    public Teacher(String name, String gender, String dob, String address, String className, double salaryPerHour, int hoursInMonth)
    {
        super();
        this.className = className;
        this.salaryPerHour = salaryPerHour;
        this.hoursInMonth = hoursInMonth;
    }
    
    public String getClassName()
    {
        return this.className;
    }
    
    public void setClassName(String className)
    {
        this.className = className;
    }
    
    public double getSalaryPerHour()
    {
        return this.salaryPerHour;
    }
    
    public void setSalaryPerHour(double salaryPerHour)
    {
        this.salaryPerHour = salaryPerHour;
    }
    
    public int getHoursInMonth()
    {
        return this.hoursInMonth;
    }
    
    public void setHoursInMonth(int hoursInMonth)
    {
        this.hoursInMonth = hoursInMonth;
    }
    
    @Override
    public void PutInfo()
    {
        super.PutInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap lop day: "); this.className = sc.nextLine();
        System.out.print("Nhap luong mot gio day: "); this.salaryPerHour = sc.nextDouble();
        System.out.print("Nhap so gio day trong mot thang: "); this.hoursInMonth = sc.nextInt();
    }
    
    @Override
    public void ShowInfo()
    {
        super.ShowInfo();
        System.out.print("Lop day: " + this.className);
        System.out.print("Luong mot gio day: " + this.salaryPerHour);
        System.out.print("So gio day trong thang: " + this.hoursInMonth);
    }
    
    public double calculateSalary()
    {
        if(this.className.startsWith("G") || this.className.startsWith("H") || this.className.startsWith("I") || this.className.startsWith("K"))
        {
            return this.salaryPerHour * this.hoursInMonth;
        }
        else if(this.className.startsWith("L") || this.className.startsWith("M"))
        {
            return this.salaryPerHour * this.hoursInMonth + 200000;
        }
        return 0;
    }
    
}