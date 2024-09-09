import java.util.Scanner;
class Employee
{
    String name;
    String address;
    float salary;
    String job_title;
    Employee()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Address : ");
        address = sc.nextLine();
        System.out.println("Enter salary : ");
        salary = sc.nextFloat();
        sc.nextLine();
        System.out.println("Enter Job Title : ");
        job_title = sc.nextLine();
    }
    int Bonus_cal() {
        int Bonus = (int) (salary * 0.0833);
        return Bonus;
    }
}

class Manager extends Employee
{
    String manager_id;
    Manager()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Manager ID : ");
        manager_id = sc.nextLine();
    }
}

class Developer extends Employee
{
    String developer_id;
    Developer()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Developer ID : ");
        developer_id = sc.nextLine();
    }
}

class Programmer extends Employee
{
    String programmer_id;
    Programmer()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Programmer ID : ");
        programmer_id = sc.nextLine();
    }
}

class Employee_Hierarchy
{
    public static void main(String [] args)
    {
        // Employee obj1 = new Employee();
        System.out.println("---------------------------------Information About Manager---------------------------------------");
        Employee obj2 = new Manager();
        System.out.println("---------------------------------Information About Developer---------------------------------------");
        Employee obj3 = new Developer();
        System.out.println("---------------------------------Information About Programmer---------------------------------------");
        Employee obj4 = new Programmer();
    }
}
