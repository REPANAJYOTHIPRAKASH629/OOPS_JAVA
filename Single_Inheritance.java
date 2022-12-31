class Animal
{  
	void eat()
	{
		System.out.println("eating...");
	}  
}  
class Single_Inheritance extends Animal
{  
	void bark()
	{
		System.out.println("barking...");
	}  
	public static void main(String args[])
	{  
		Single_Inheritance d=new Single_Inheritance();  
		d.bark();  
		d.eat();
	}	
}  
