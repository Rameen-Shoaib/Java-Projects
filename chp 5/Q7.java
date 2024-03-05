public class Q7 
{
    public static void main(String[] args)
    {
        int i = 4; 
        while(i > 0)
        {
            int j = 0; 
            while(j < i)
            {
                System.out.printf("*");
                j++;
            }
            i--;
            System.out.print("\n");
        }  
    }
}
