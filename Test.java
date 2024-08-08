// Write a program to demonstrate single inheritance by creating a class Person
// and deriving classes Student & Employee from it. Define class person having data
// members name, birthdate, height, weight, address and calculateAge method.
// Derive class Student with members as roll no, marks, calculateAvg().Also derive
// class Employee with members as empId, salary, calculateTax().

// import java.time.LocalDate;
import java.util.Scanner;


class Person 
{
    String name;
    int day , month ,year;
    //LocalDate birthdate;
    float height;
    float weight;
    String address;
    
    public void Input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name : ");
        name = sc.next();

        System.out.println("Enter Birthdate : ");
        System.out.println("Day : ");
        day = sc.nextInt();
        System.out.println("Month : ");
        month =  sc.nextInt();
        System.out.println("Year : ");
        year =  sc.nextInt();

        System.out.println("Enter Your Height : ");
        height = sc.nextFloat();

        System.out.println("Enter Your Weight : ");
        weight = sc.nextFloat();

        sc.nextLine();
        System.out.println("Enter Your Address : ");
        address = sc.nextLine();
    }

    void calculateAge()
    {
        Scanner sc = new Scanner(System.in);
        int current;
        System.out.println("Enter Current Year : ");
        current = sc.nextInt();
        int diff = (current-year);
        System.out.println("Age is : "+diff);
    }
    public static void main(String[] args)
    {
        Person p1 = new Person();
        p1.Input();
        p1.calculateAge();
    }

}
