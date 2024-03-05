import java.util.Scanner;
public class Q7 
{
    static void pattern(int n)
    {
        if (n > 0)
            for (int i = n; i > 0; i--)
            {
                System.out.print("* ");
            }
            System.out.println();
            pattern(n-1); 
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = input.nextInt();
        pattern(num);
    }    
}
