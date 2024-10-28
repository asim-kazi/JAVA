//Write a program to calculate CGPA of student...

import java.util.Scanner;

class Marks {
    int total = 0;
    float percentage = 0;  
    float cgpa = 0;
    public void getdata() {
        int English = 0;
        int Maths = 0;
        int Science = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter English Marks : ");
        English = sc.nextInt();
        System.out.println("Enter Maths Marks : ");
        Maths = sc.nextInt();
        System.out.println("Enter Science Marks : ");
        Science = sc.nextInt();

        total = English + Maths + Science;
        System.out.println("Your Total Marks Is : " + total);
    }

    public void calculate() {
        percentage = ((float) total / 300) * 100;
        cgpa = percentage/10 ;
        System.out.println("Your CGPA Is : " + cgpa);
    }
}

public class CGPA {
    public static void main(String[] args) {
        Marks obj1 = new Marks();
        obj1.getdata();
        obj1.calculate();
    }
}
