class Arithmetic_Null_Exception {
    public static void main(String args[])
    {
        try
        {
            int data = 50/0;
        }
        catch( ArithmeticException e )
        {
            System.out.println(e);
        }
	try{
      		String str=null;
      		System.out.println(str.length());
    	   }
        catch(NullPointerException e)
	{
      		System.out.println("NullPointerException..");
        }
    System.out.println("rest of the code");
    }    
}