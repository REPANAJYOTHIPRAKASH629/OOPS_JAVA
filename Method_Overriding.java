class Vehicle
{   
	void run()
	{
		System.out.println("Vehicle is running");
	}  
}  
 
class Method_Overriding extends Vehicle
{  
	void run()
	{
		System.out.println("Bike is running safely");
	}  
	public static void main(String args[])
	{  
		Method_Overriding obj = new Method_Overriding();
		obj.run();
	}  
} 
