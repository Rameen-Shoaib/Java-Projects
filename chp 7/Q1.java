public class Q1 
{
    static void multiplication_table(int n)
    {
        for (int i = 1; i <= 10; i++)
        {
                System.out.println(n + " x " + i + " = " + i*n);
        }   
    }
    public static void main(String[] args)
    {
        multiplication_table(2);
    } 
}
