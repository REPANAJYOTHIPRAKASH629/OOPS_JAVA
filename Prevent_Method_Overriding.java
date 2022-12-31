class Bike
{  
	final void run()
	{
		System.out.println("running");
	}  
}  
     
class Prevent_Method_Overriding extends Bike
{  
	void run()
	{
		System.out.println("running safely with 100kmph");
	}  
     
	public static void main(String args[])
	{  
		Prevent_Method_Overriding honda= new Prevent_Method_Overriding();  
		honda.run();  
	}  
} 
