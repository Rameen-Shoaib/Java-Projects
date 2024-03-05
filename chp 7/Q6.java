public class Q6 
{
    static void average(int ... arr)
    {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("Sum (Number of argument(s) is/are " + arr.length + "): " +sum);
    }
    public static void main(String[] args)
    {
        average(1,2,3,4,5);
    }
}
