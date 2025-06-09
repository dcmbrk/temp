package BuildClass;
import java.util.Scanner;

public class Person
{
    private String name;
    private String gender;
    private String dob;
    private String address;
    
    public Person(){}
    public Person(String name, String gender, String dob, String address)
    {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
        this.address = address;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getGender()
    {
        return this.gender;
    }
    
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    
    public String getDob()
    {
        return this.dob;
    }
    
    public void setDob(String dob)
    {
        this.dob = dob;
    }
    
    public String getAddress()
    {
       return this.address;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public void PutInfo()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: "); this.name = sc.nextLine();
        System.out.print("Nhap gioi tinh: "); this.gender = sc.nextLine();
        System.out.print("Nhap ngay sinh (DD/MM/YYY): "); this.dob = sc.nextLine();
        System.out.print("Nhap dia chi: "); this.address = sc.nextLine();
    }
    
    public void ShowInfo()
    {
        System.out.println("Ten: " + this.name);
        System.out.println("Gioi tinh: " + this.gender);
        System.out.println("Ngay sinh: " + this.dob);
        System.out.println("Dia chi: " + this.address);
    }
}