public class Q5 
{
    public static void main(String[] args)
    {
        float [] arr1 = {2.5f, 3.4f, 0.2f, 98.7f, 65.7f};
        for (int i = arr1.length-1; i >= 0; i--)
        {
            System.out.println(arr1[i]);
        }
        
        int [] arr = {3, 2, 1, 5, 0, 4};
        int n = Math.floorDiv(arr.length, 2);
        for (int i = 0; i < n; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        for (int elem : arr)
        {
            System.out.println(elem);
        }
        }
}
