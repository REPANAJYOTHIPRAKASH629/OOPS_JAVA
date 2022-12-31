import java.util.Scanner;

public class VCSD 
{
    public static void main(String args[])
    {
        int vowels=0,consonants=0,digits=0,specialsymbols=0;
        String s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence...");
        s = sc.nextLine();
        char str[] = s.toCharArray();
        int n = str.length;
        for(int i=0;i<str.length;i++)
        {
            if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U')
            {
                vowels++;
            }
            else if(str[i]>='a' && str[i]<='z'||str[i]>='A' && str[i]<='Z')
            {
                consonants++;
            }
            else if(str[i]>='0' && str[i]<='9')
            {
                digits++;
            }
            else if(str[i]==' ')
            {
                continue;
            }
            else
            {
                specialsymbols++;
            }
        }
        System.out.println("Vowels : "+vowels);
        System.out.println("Consonants : "+consonants);
        System.out.println("Digits : "+digits);
        System.out.println("SpecialSymbols : "+specialsymbols);    
    }   
}
