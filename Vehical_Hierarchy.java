import java.util.Scanner;
class Vehical
{
    String make;
    int year;
    Vehical()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sc.nextLine();
        System.out.println("Enter Age: ");
        age = sc.nextInt();
        System.out.println("Enter salary: ");
        salary = sc.nextFloat();
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
