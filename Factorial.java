import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int num,fact=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        num = sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of a number "+ num + " is "+fact);
    }
}
