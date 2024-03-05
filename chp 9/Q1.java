class Cylinder1
{
    private float radius;
    private float height;
    
    public void setRadius(float r)
    {
        radius = r;
    }
    public float getRadius()
    {
        return radius;
    } 
    public void setHeight(float h)
    {
        height = h;
    }
    public float getHeight()
    {
        return height;
    }
}
public class Q1 
{
    public static void main(String[] args)
    {
        Cylinder1 obj = new Cylinder1();
        obj.setRadius(9);
        System.out.println("Radius: " + obj.getRadius());
        obj.setHeight(12);
        System.out.println("Height: " + obj.getHeight());
    } 
}
