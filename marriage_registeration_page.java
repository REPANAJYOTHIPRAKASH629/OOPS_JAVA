class  TooYoung extends Exception
{
    TooYoung(String s)
    {
        super(s);
    }
}
class  TooOld extends Exception
{
    TooOld(String s)
    {
        super(s);
    }
}
class User_Defined_Exception {
    static void validate(int age) throws TooYoung,TooOld
    {
        if (age<18)
        {
            throw new TooYoung("tooo young ...");
        }
	else if (age>18)
        {
            throw new TooOld("tooo old..... ");
        }
        else
        {
            System.out.println("Thank you for Registration");
        }
    }
    public static void main(String args[])
    {
        try 
        {
            validate(49);
        }
        catch(Exception m)
        {
            System.out.println("Exception occurred : "+m);
        }
    } 
}