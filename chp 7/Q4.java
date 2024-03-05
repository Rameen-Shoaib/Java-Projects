import java.util.Scanner;
public class Q4 
{
    static void pattern(int n)
    {
         for (int i = 0; i < n; i++)
         {
            for (int j = n; j > i; j--)
            {
                System.out.print("* ");
            }
            System.out.println("");
         }
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = input.nextInt();
        pattern(num);
    }    
}
