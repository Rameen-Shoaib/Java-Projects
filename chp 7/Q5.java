public class Q5 
{
    static int fibonacci(int n)
    {
        if (n == 1 || n == 2)
            return n-1;
        int sum;
        sum = fibonacci(n-1) + fibonacci(n-2);
        return sum;
    }
    public static void main(String[] args)
    {
        int result = fibonacci(1);
        System.out.println(result);
    }    
}
