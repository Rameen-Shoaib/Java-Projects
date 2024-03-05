public class Q6 
{
    public static void main(String[] args)
    {
        int [] arr = {2, 3, 0, 98, 65};
        int max = Integer.MIN_VALUE;;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        System.out.println("Max: " +max);
    }    
}
