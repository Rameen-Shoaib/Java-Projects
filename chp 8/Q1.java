class Employee
{
    int salary;
    public int getSalary()
    {
        return salary;
    }
    String name;
    public String getName()
    {
        return name;
    }
    public void setName(String na_me)
    {
        name = na_me;
    }
}
public class Q1 
{
    public static void main(String[] args)
    {
        Employee obj = new Employee();
        obj.setName("Rameen");
        System.out.println(obj.getName());
        obj.salary = 50;
        System.out.println(obj.getSalary());
    }
}
