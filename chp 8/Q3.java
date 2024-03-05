class Square
{
    int length_of_sides;
    public float area()
    {
        float area = length_of_sides * length_of_sides;
        return area;
    }
    public float perimeter()
    {
        float perimeter = 4 * length_of_sides;
        return perimeter;
    }
}
public class Q3 
{
    public static void main(String[] args)
    {
        Square obj = new Square();
        obj.length_of_sides = 39;
        System.out.println(obj.area());
        System.out.println(obj.perimeter());
    }
}
