import java.util.Scanner;
public class Q5 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int year = input.nextInt();
        if (year%4 == 0 || year%400 == 0 || year%100 == 0)
            System.out.println("It is a leap year.");
        else
             System.out.println("It is not a leap year.");
    }
}
