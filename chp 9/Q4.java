class Rectangle
{
    private float length;
    private float breadth;
    
    public Rectangle()
    {
        length = 9;
        breadth = 12;
    }
    public Rectangle(float l, float b)
    {
        length = l;
        breadth = b;
    }
    
    public void setLength()
    {
        this.length = length;
    }
    public float getLength()
    {
        return length;
    } 
    public void setBreadth()
    {
        this.breadth = breadth ;
    }
    public float getBreadth()
    {
        return breadth;
    }
}
public class Q4
{
    public static void main(String[] args)
    {
        Rectangle obj = new Rectangle(4,5);
        obj.setLength();
        System.out.println("Radius: " + obj.getLength());
        obj.setBreadth();
        System.out.println("Height: " + obj.getBreadth());
    } 
}

