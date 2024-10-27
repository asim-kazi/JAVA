//Write a program to Kilo_meter To Convert Into Miles

import java.util.Scanner;

public class Convert 
{  
    public static void main(String[] args) 
    {
        float km;
        double miles;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Kilo_meter To Convert Into Miles : ");
        km = sc.nextFloat();
        miles = (km / 1.609344);
        System.out.println("Miles Is : "+miles);
    }    
}
