import java.util.Scanner;
public class Q3 
{
    public static void main(String[] args)
    {
        String Letter = ("Dear <|name|>, Thanks a lot");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String enter = input.nextLine();
        System.out.println(Letter.replace("<|name|>", enter));   
    }   
}
