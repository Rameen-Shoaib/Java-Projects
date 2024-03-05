public class Q11 
{
public static void main(String[] args)
    {
        int n = 5;
        int sum = 0;
        for (int i = 0; i <= n; i+=2)
        {
            System.out.println(i);
            sum = sum + i; 
        }
        System.out.println("Sum: " +sum);
    }    
}
