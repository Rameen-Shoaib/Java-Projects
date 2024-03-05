public class Q9 
{
public static void main(String[] args)
    {
        int n = 8;
        int i = 10;
        int sum = 0;
        while (i >= 1)
        {
            System.out.println(i+ " x " + n + " = " +i*n);
            sum = sum + (i*n);
            i--;
        }
        System.out.println("Sum: " +sum);
    }    
}
