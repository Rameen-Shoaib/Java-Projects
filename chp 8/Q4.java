class Rectangle
{
    int length;
    int width;
    public float area()
    {
        float area = length * width;
        return area;
    }
    public float perimeter()
    {
        float perimeter = 2 * (length + width);
        return perimeter;
    }
}
public class Q4 
{
    public static void main(String[] args)
    {
        Rectangle obj = new Rectangle();
        obj.length = 39;
        obj.width = 20;
        System.out.println(obj.area());
        System.out.println(obj.perimeter());
    }
}