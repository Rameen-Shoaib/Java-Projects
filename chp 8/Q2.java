class cellPhone
{
    public void ringing()
    {
        System.out.println("Ringing...");
    }
    public void vibrating()
    {
        System.out.println("Vibrating...");
    }
}
public class Q2 
{
    public static void main(String[] args)
    {
        cellPhone obj = new cellPhone();
        obj.ringing();
        obj.vibrating();
    }
}
