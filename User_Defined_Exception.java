class InvalidAgeException extends Exception
{
    InvalidAgeException(String s)
    {
        super(s);
    }
}
class User_Defined_Exception {
    static void validate(int age) throws InvalidAgeException
    {
        if (age<18)
        {
            throw new InvalidAgeException("not valid");
        }
        else
        {
            System.out.println("Welcome to vote");
        }
    }
    public static void main(String args[])
    {
        try 
        {
            validate(12);
        }
        catch(Exception m)
        {
            System.out.println("Exception occurred : "+m);
        }
        System.out.println("rest of the code");
    } 
}
