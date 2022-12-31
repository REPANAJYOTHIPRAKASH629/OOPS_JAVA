interface Interface1
{
    int a = 32;
    public abstract void method1();
    public abstract void method2();
}
public class EgInterface implements Interface1 {
    public void method1()
    {
        System.out.println("Method1 is implementing");
    }
    public void method2()
    {
        System.out.println("Method2 is implementing");
    }
    public static void main(String args[])
    {
        EgInterface eg = new EgInterface();
        eg.method1();
        eg.method2();
        System.out.println(Interface1.a);
    }
}
