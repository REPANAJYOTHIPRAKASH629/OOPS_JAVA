import java.util.Scanner;
abstract class Abstract
{
    int a = 3;
    public abstract void method1();
    public abstract void method2();
    public void ConcreteMethod()
    {
        System.out.println("Concrete Method Executed");
    }
}
public class EgAbstract extends Abstract 
{
    public void method1()
    {
        System.out.println("Method1 is executed");
    }   
    public void method2()
    {
        System.out.println("Method2 is executed");
    }
    public static void main(String args[])
    {
        EgAbstract ega = new EgAbstract();
        ega.method1();
        ega.method2();
        ega.ConcreteMethod();
        System.out.println(ega);
    }
}
