import java.util.Arrays;
import java.util.Scanner;

public class Sorted_Strings 
{
    public static void main(String args[])
    {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        int n;
        System.out.println("Enter the no. of elements : ");
        n = sc1.nextInt();
        String str[] = new String[n];
        System.out.println("Enter your Strings : ");
        for(int i=0;i<n;i++)
        {
            str[i] = sc2.nextLine();
        }
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));        
    }    
}
