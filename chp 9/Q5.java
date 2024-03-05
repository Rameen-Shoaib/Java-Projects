class Sphere
{
    private float radius;
    double pi = Math.PI;
    
    public void setRadius(float r)
    {
        radius = r;
    }
    public float getRadius()
    {
        return radius;
    }
    
    public double surfaceArea()
    {
        double area = (4 * pi * radius * radius);
        return area;
    }
    public double volume()
    {
        double vol = (pi * radius * radius * radius * (4/3));
        return vol;
    }
}
public class Q5 
{
    public static void main(String[] args)
    {
        Sphere obj = new Sphere();
        obj.setRadius(9);
        System.out.println("Radius: " + obj.getRadius());
        System.out.println("Surface Area: " + obj.surfaceArea());
        System.out.println("Volume: " + obj.volume());
    } 
}
