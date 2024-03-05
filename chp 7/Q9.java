public class Q9 
{
    static float convert(float n)
    {
        float cal;
        return cal = (n * 9f/5f) + 32f;
    }
    public static void main(String[] args)
    {
        float n = 32;
        float result = convert(n);
        System.out.println("Celsius to Fahrenheit: " + n + " -> " + result);
    }
}
