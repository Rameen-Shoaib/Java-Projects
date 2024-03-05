class Cylinder2
{
    private double radius;
    private double height;
    double pi = Math.PI;
    
    public void setRadius(double r)
    {
        radius = r;
    }
    public double getRadius()
    {
        return radius;
    } 
    public void setHeight(double h)
    {
        height = h;
    }
    public double getHeight()
    {
        return height;
    }
    public double surfaceArea()
    {
        double area = (2 * pi * radius * height) + (2 * pi * radius * radius);
        return area;
    }
    public double volume()
    {
        double vol = (pi * radius * radius * height);
        return vol;
    }
}
public class Q2 
{
    public static void main(String[] args)
    {
        Cylinder2 obj = new Cylinder2();
        obj.setRadius(9);
        System.out.println("Radius: " + obj.getRadius());
        obj.setHeight(12);
        System.out.println("Height: " + obj.getHeight());
        System.out.println("Surface Area: " + obj.surfaceArea());
        System.out.println("Volume: " + obj.volume());
    } 
}

