import java.util.Scanner;
public class Q6 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a domain: ");
        String domain = input.next();
        if (domain.endsWith("com"))
            System.out.println("commercial website");
        else if (domain.endsWith("org"))
            System.out.println("organization website");
        else if (domain.endsWith("in"))
            System.out.println("indian website");
    }
}

