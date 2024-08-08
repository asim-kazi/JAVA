import java.util.Scanner;

class Employee
{
    Scanner sc = new Scanner(System.in); 
    String first,last;
    double salary;
    public void getdata()
    {
        System.out.println("Enter First Name : ");
        first=sc.next();
        System.out.println("Enter Last Name : ");
        last=sc.next();
        System.out.println("Enter Monthly Salary : ");
        salary=sc.nextDouble();
    }

    public void setdata()
    {
        salary+=(salary*0.1);
        System.out.println("Raised Salary : "+salary);
    }

    public void putdata()
    {
        System.out.println("First Name      Last Name       Monthly Salary");
        System.out.println(first+"          "+last+"            "+salary);
    }
}

public class Constructor 
{
    public static void main(String[] args)
    {
        Employee obj1= new Employee();
        obj1.getdata();
        obj1.setdata();
        obj1.putdata();
    }
}
