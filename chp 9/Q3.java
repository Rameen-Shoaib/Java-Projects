class Cylinder3
{
    private float radius;
    private float height;
    
    public Cylinder3()
    {
        radius = 9;
        height = 12;
    }
    public void setRadius()
    {
        this.radius = radius;
    }
    public float getRadius()
    {
        return radius;
    } 
    public void setHeight()
    {
        this.height = height ;
    }
    public float getHeight()
    {
        return height;
    }
}
public class Q3
{
    public static void main(String[] args)
    {
        Cylinder3 obj = new Cylinder3();
        obj.setRadius();
        System.out.println("Radius: " + obj.getRadius());
        obj.setHeight();
        System.out.println("Height: " + obj.getHeight());
    } 
}
