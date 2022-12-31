final class SuperClass
{
    public void method1()
    {
        System.out.println("Method1 executed");
    }
}
public class Prevent_Inheritance_Using_Final extends SuperClass
{
    public static void main(String args[])  
    {
        Prevent_Inheritance_Using_Final eg1 = new Prevent_Inheritance_Using_Final();
        eg1.method1();
    }
}
