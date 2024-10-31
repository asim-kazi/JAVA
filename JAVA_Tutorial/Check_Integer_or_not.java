//check wheather user input integer or not...
import java.util.Scanner;

public class Check_Integer_or_not 
{
    public static void main(String[] args) {
        System.out.println("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
