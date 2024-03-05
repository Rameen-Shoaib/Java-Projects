import java.util.Scanner;
public class Q3 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount: ");
        float amount = input.nextFloat();
        
        if (amount < 2.5f)
        {
            System.out.println("No tax");
        }
        
        else if (amount >= 2.5f && amount <= 5.0f)
        {
            float value = (5f/100f)*amount;
            System.out.println("5% tax: " +value);
        }
        
        else if (amount >= 5.0f && amount <= 10.0f)
        {
            float value2 = (20f/100f)*amount;
            System.out.println("20% tax: " +value2);
        }
        
        else if (amount >= 10.0f)
        {
            float value3 = (30f/100f)*amount;
            System.out.println("30% tax: " +value3);
        }      
    }  
}
