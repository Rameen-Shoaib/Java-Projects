import java.util.Scanner;
public class Q8
{
    static void pattern(int n)
    {                                       // bottom to up (n = 4)
        if (n > 0)                          // 4 > 0 --> 3 > 0 --> 2 > 0 --> 1 > 1 
            pattern(n-1);                   // 4 - 1 = 3 --> 3 - 1 = 2 --> 2 - 1 = 1 --> 1 - 1 = 0 
            for (int i = 0; i < n; i++)     // 0 < 4 (4 time) --> 0 < 3 (3 times --> 0 < 2 (2 times) --> 0 < 1 (1 time)
            {
                System.out.print("* ");
            }
               System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = input.nextInt();
        pattern(num);
    }    
}
