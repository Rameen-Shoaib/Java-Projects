import java.util.Scanner;
public class Q2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int [] arr = new int[5];
        int i;
        int num = 1;
        for (i = 0; i < arr.length; i++)
        {
            arr[i] = input.nextInt();
            if (num == arr[i])
                System.out.println("Number is in the array.");
        }
    }    
}
