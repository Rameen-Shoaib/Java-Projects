public class Q2 
{
    public static void main(String[] args)
    {
        int i = 0;
        int n = 10;
        int sum = 0;
        while (i <= n)
        {
            System.out.println(i);
            sum = sum + i;
            i+=2;
        }
        System.out.println("Sum: " +sum);
    }  
}
