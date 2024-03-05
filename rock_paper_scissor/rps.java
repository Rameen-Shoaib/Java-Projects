import java.util.Scanner;
public class rps
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("-------------------");
        System.out.println("Press 0 for Rock");
        System.out.println("Press 1 for Paper");
        System.out.println("Press 2 for Scissor");
        System.out.println("-------------------");
        
        for (int i = 0; i < 3; i++)
        {
        
        System.out.print("Enter a number (between 0 to 2): ");
        int num1 = input.nextInt();
        switch (num1)
        {
            case 0:
                System.out.println("Rock");
                break;
            case 1:
                System.out.println("Paper");
                break;
            case 2:
                System.out.println("Scissor");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
        
        System.out.println("**********************************");
                
        int num2 = (int)(Math.random() * 3);
        System.out.println("Number entered by the computer: " +num2);
        switch (num2)
        {
            case 0:
                System.out.println("Rock");
                break;
            case 1:
                System.out.println("Paper");
                break;
            case 2:
                System.out.println("Scissor");
                break;
            default:
                System.out.println("Invalid number");
                break;
        }
        
        boolean cond1 = (num1 == num2);
        boolean cond2 = (num1 == 0 && num2 == 1 || num1 == 1 && num2 == 2 || num1 == 2 && num2 == 0);
        boolean cond3 = (num1 == 0 && num2 == 2 || num1 == 1 && num2 == 0 || num1 == 2 || num2 == 1);
        boolean cond4 = (num1 > 2 || num2 > 2);
        
        if (cond1)
        {
            System.out.println("----------");
            System.out.println("It's a tie");
            System.out.println("----------");
        } 
        else if (cond2)
        {
            System.out.println("------------");
            System.out.println("Computer win");
            System.out.println("------------");
        }
        else if (cond3)
        {
            System.out.println("-------");
            System.out.println("You win");
            System.out.println("-------");
        }
        else if (cond4)
        {
            System.out.println("---------");
            System.out.println("Try again");
            System.out.println("---------");
        }
        
        }
    }
}
/*
YOU	COMPUTER    RESULT
0	0           tie
0	1           Computer win
0	2           You win
1	0           You win
1	1           tie
1	2           Computer win
2	0           Computer win
2	1           You win
2	2           tie
*/

