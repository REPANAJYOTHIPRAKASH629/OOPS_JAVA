import java.util.Scanner;
class qudratic_equation {
    public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter a avalue : ");
        a = sc.nextDouble();
        System.out.println("Enter b value : ");
        b = sc.nextDouble();
        System.out.println("Enter c value : ");
        c = sc.nextDouble();
        double d = (b*b)-(4*a*c);
        double D = Math.sqrt(d);
        double r = 2*a;
        if(D>0)
        {
            System.out.println("roots are Real & Unequal");
            double root1 = (D-b)/r;
            double root2 = (-D-b)/r;
            System.out.println("The roots are...");
            System.out.println(root1);
            System.out.println(root2);
        }
        else if(D==0)
        {
            System.out.println("roots are Quadratic Equation are Real and Equal");
            double root = (-b)/r;
            System.out.println("roots are : "+root);
        }
        else
        {
            System.out.println("The roots of the Quadratic Equation are Complex and Different");
            System.out.println("Roots are...");
            System.out.println((-b/r)+" +i "+D);
            System.out.println((-b/r)+" -i "+D);
        }
    }    
}
