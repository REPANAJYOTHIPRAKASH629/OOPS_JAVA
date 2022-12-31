import java.util.Scanner;
public class Fibonaaci_Series
{
    public static void main(String args[])
    {
        int num,fnum=1,snum=1,pnum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms : ");
        num = sc.nextInt();
        System.out.println("Fibonacci series up to "+ num +" terms : ");
        System.out.println(fnum);
        System.out.println(snum);
        for(int i=1;i<=num;i++)
        {
            pnum = fnum+snum;
            fnum = snum;
            snum = pnum;
            System.out.println(pnum);
        }
    }
}
