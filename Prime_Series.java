import java.util.Scanner;
public class Prime_Series {
    public static void main(String args[])
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a avalue : ");
        num = sc.nextInt();
        for(int i=2;i<=num;i++)
        {
            boolean flag=false;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag = true;
                    break;
                }
            }
            if(flag == false)
            {
                System.out.println(i);
            }
        }
    }
}
