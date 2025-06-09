package BuildClass;
import java.util.Scanner;

public class Student extends Person
{
    private String id;
    private double dtb;
    private String email;
    
    public Student()
    {
        super();
    }
    
    public Student(String name, String gender, String dob, String address, String id, double dtb, String email)
    {
        super(name, gender, dob, address);
        this.id = id;
        this.dtb = dtb;
        this.email = email;
    }
    
    public String getId()
    {
        return this.id;
    }
    
    public void setId(String id)
    {
        this.id = id;
    }
    
    public double getDtb()
    {
        return this.dtb;
    }
    
    public void setDtb(double dtb)
    {
        this.dtb = dtb;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    @Override
    public void PutInfo()
    {
        super.PutInfo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap MSV: "); this.id = sc.nextLine();
        System.out.print("Nhap DTB: "); this.dtb = sc.nextDouble(); sc.nextLine();
        System.out.print("Nhap emai: "); this.email = sc.nextLine();
    }
    
    @Override
    public void ShowInfo()
    {
        super.ShowInfo();
        System.out.print("MSV: " + this.id);
        System.out.print("DTB: " + this.dtb);
        System.out.print("Email: " + this.email);
    }
    
    public boolean isScholarship()
    {
        return dtb > 8.0;
    }
}