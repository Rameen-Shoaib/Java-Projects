class Circle
{
    float pi = 3.142f;
    int radius;
    public float area()
    {
        float area = pi * radius * radius;
        return area;
    }
    public float perimeter()
    {
        float perimeter = 2 * pi * radius;
        return perimeter;
    }
}
public class Q6 
{
    public static void main(String[] args)
    {
        Circle obj = new Circle();
        obj.radius = 39;
        System.out.println(obj.area());
        System.out.println(obj.perimeter());
    }
}
