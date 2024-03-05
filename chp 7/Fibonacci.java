public class Fibonacci 
{
    static int recursive(int n)
    {
        if (n == 1 || n == 2)
            return n-1;
        return recursive(n-1) + recursive(n-2);
    }
    static void iterative(int n)
    {
        System.out.println("Iterative");
        int num1 = 0;
        int num2 = 1;
        for (int i = 1; i <= n; i++)
        {
            System.out.println(num1);       // 0 > 1 > num1(1) > num2(1)
            int next = num1 + num2;         // 1 > 2 > num1(1) > num2(2)
            num1 = num2;                    // 1 > 3 > num1(2) > num2(3)
            num2 = next;                    // 2 > 5 > num1(3) > num2(5)
        }                                   // 3 > 8 > num1(5) > num2(8)
    }
    public static void main(String[] args)
    {
        int n = 10;
        System.out.println("Recursive");
        for (int i = 1; i <= n; i++)
        {
            System.out.println(recursive(i));   
        }
        iterative(10);
    }
}