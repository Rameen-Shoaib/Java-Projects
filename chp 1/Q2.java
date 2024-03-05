import java.util.Scanner;
public class Q2 
{
    public static void function2(float a, float b, float c)
    {
        float CGPA = (a + b + c)/3;
        System.out.println(CGPA);
    }
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        float n1 = input.nextFloat();
        float n2 = input.nextFloat();
        float n3 = input.nextFloat();
        function2(n1, n2, n3);
    } 
}
