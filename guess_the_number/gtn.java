import java.util.Scanner;
class game
{
    int num;
    int user_input;
    int numberOfGuesses = 0;
    
    public game(int n)
    {
        num = (int)(Math.random() * n);
        System.out.println(num);
    }
    
    public void takeUserInput()
    {
        numberOfGuesses = numberOfGuesses + 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number (between 0 to 100): ");
        user_input = input.nextInt();
        
        if (user_input > 100 || user_input < 0)
        {
            System.out.println("--------------");
            System.out.println("Invalid Number");
            System.out.println("--------------");
            System.exit(0);
        }
        if (user_input == num)
        {
            System.out.println("---------------------");
            System.out.println("Your guess is correct");
            System.out.println("---------------------");
        }
        else if (user_input > num)
        {
            System.out.println("-----------");
            System.out.println("Too high...");
            System.out.println("-----------");
        }
        else if (user_input < num)
        {
           System.out.println("----------");
           System.out.println("Too low...");
           System.out.println("----------");
        }
        
        System.out.println("|Score: " + numberOfGuesses + "|");
    }
    
    public void isCorrectNumber()
    {
        while (user_input != num)
        {
            takeUserInput();
        }
    }
}

public class gtn 
{
    public static void main(String[] args)
    {
        game obj = new game(101);
        obj.takeUserInput();
        obj.isCorrectNumber();
    }
}