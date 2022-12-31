import java.util.Scanner;
public class Palindrome 
{
    public static void main(String args[])
    {
        String str1="",str2="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        str1 = sc.nextLine();
        for(int i=str1.length()-1;i>=0;i--)
        {
            str2 = str2+str1.charAt(i);
            if(str1.equals(str2))
            {
                System.out.println("String is palindrome");
                continue;
            }
            else
            {
                System.out.println("String is not a palindrome");
            }
        }
    }    
}
