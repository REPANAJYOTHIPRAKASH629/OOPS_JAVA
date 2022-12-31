import java.util.Scanner;
interface MyInterface
{
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    public void area();
    public void perimeter();
}
public class Area_Perimeter_of_Rectangle_Using_Interfaces implements MyInterface
{
    public void perimeter()
    {
        int c = 2*(a+b);
        System.out.println("perimeter of rectangle is : "+c);
    }    
    public void area()
    {
        int d = a*b;
        System.out.println("Area of rectangle is : "+d);
    }
    public static void main(String args[])
    {
        MyInterface mi = new Area_Perimeter_of_Rectangle_Using_Interfaces();
        mi.area();
        mi.perimeter();
    }
}
