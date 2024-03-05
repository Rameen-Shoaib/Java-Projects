class Tommy
{
    public void hitting()
    {
        System.out.println("Hitting...");
    }
    public void running()
    {
        System.out.println("Running...");
    }
    public void firing()
    {
        System.out.println("Firing...");
    }
}
public class Q5 
{
    public static void main(String[] args)
    {
        Tommy obj = new Tommy();
        obj.hitting();
        obj.running();
        obj.firing();
    }
}
