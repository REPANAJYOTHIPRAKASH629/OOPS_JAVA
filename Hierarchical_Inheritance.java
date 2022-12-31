class Animal
{  
	void eat()
	{
		System.out.println("eating...");
	}  
}  
class Dog extends Animal
{  
	void bark()
	{
		System.out.println("barking...");
	}  
	
}  
class Hierarchical_Inheritance extends Animal
{  
	void meow()
	{
		System.out.println("meowing...");
	}  
	public static void main(String args[])
	{  
		Hierarchical_Inheritance d=new Hierarchical_Inheritance(); 
		d.eat();		
		//d.bark();  		
		d.meow();
	}
}  
