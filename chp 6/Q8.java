public class Q8 
{
    public static void main(String[] args)
    {
        int [] arr = {2, 3, 4, 8, 0};
        boolean Is_sorted = true;
        for (int i = 0; i < arr.length-1; i++)
        {
            if (arr[i] > arr[i+1])
            {
                Is_sorted = false;
            }
        }
        if (Is_sorted == true)
            System.out.println("Sorted");
        else
            System.out.println("Not Sorted");
    }  
}
