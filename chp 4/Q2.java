import java.util.Scanner;
public class Q2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter marks of subject one (out of 100): ");
        float subj1 = input.nextFloat();
        float sub1 = (subj1/100)*100;
        
        System.out.println("Enter marks of subject two (out of 100): ");
        float subj2 = input.nextFloat();
        float sub2 = (subj2/100)*100;
        
        System.out.println("Enter marks of subject three (out of 100): ");
        float subj3 = input.nextFloat();
        float sub3 = (subj3/100)*100;
        
        float sum = subj1 + subj2 + subj3;
        float percent = (sum/300)*100;
        System.out.println("Overall percentage: " + percent);
        if (sub1 >= 33 && sub2 >= 33 && sub3 >= 33 && percent >= 40)
            System.out.println("Pass");
        else
            System.out.println("Fail");
    }
}