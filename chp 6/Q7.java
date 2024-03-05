public class Q7 
{
    public static void main(String[] args)
    {
        {
        int [] arr = {2, 3, 1, 98, 65};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println("Min: " +min);
    }  
    }    
}
