public class Q3 
{
    static int sum(int n)
    {
        // base condition
        if (n == 0)
            return 0;
        int result = n + sum(n-1);
        return result;
    }
    public static void main(String[] args)
    {
        int result = sum(3);
        System.out.println(result);
    } 
}
