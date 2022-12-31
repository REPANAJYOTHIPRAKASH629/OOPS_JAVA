import java.util.Scanner;

class EgSuper
{
    String color = "red";
    public double areaofcircle(double r)
    {
        double area;
        area = 3.14*r*r;
        return(area);
    }
}
public class Area_Of_Circle extends EgSuper
{
    public static void main(String args[])
    {
        double r;
        Scanner obj = new Scanner(System.in);
        Area_Of_Circle ec = new Area_Of_Circle();
        System.out.println("Enter the radius : ");
        r = obj.nextDouble();
        System.out.println("Color is "+ec.color);
        System.out.println("Area of Circle is : "+ec.areaofcircle(r));
    }
}
