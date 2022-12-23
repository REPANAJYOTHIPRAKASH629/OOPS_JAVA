class Number_Format_Array_String_Index_Exception
{
	public static void main(String args[])
  	{
    		try{
			int a =Integer.parseInt("23");//except number any given means exception will raises
			int d[] = new int[5];
			d[23] = 22;  // give range in above index means exception will not appear otherwise exception raises
			String subname = "Java Programming";
			System.out.println(subname.charAt(60)); // give range in above index means exception will not appear otherwise exception raises
    		    }
    		catch(ArrayIndexOutOfBoundsException e1){
      		System.out.println ("the error is : "+e1);
    		  }
		catch(StringIndexOutOfBoundsException e2){
      			System.out.println("the error is : "+e2);
    		   }
		catch(NumberFormatException e3){
      			System.out.println("the error is : "+e3);
    		    }
		finally{
            		System.out.println("finally block is always executed");
        	   }
 	 }
}