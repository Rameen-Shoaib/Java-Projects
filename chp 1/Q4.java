import java.util.Scanner;
public class Q4 
{
    public static void main(String[] args)
    {
        float km = 0.621371f;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float num = input.nextFloat();
        System.out.println("Kilometer to miles: " + num * km); 
    }
}
