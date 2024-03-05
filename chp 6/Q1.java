public class Q1 
{
    public static void main(String[] args)
    {
        float [] arr = {2.5f, 3.4f, 0.2f, 98.7f, 65.7f};
        float sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("Sum: " +sum);
    }  
}
