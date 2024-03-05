public class Q3 
{
    public static void main(String[] args)
    {
        float [] arr = {2.5f, 3.4f, 0.2f, 98.7f, 65.7f};
        float sum = 0;
        for (float i: arr)
        {
            sum = sum + i;
        }
        System.out.println("Average: " +sum/5f);
    }
}
