public class Q2 
{
    public static void main(String[] args)
    {
        char grade = 'A';
        grade = (char)(grade + 8);
        System.out.println("Encrypted grade: " +grade);
        grade = (char)(grade - 8);
        System.out.println("Decrypted grade: " +grade);
    }  
}
