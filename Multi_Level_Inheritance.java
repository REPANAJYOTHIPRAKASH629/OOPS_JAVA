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
class Multi_Level_Inheritance extends Dog
{  
	void weep()
	{
		System.out.println("weeping...");
	}  
	public static void main(String args[])
	{  
		Multi_Level_Inheritance d=new Multi_Level_Inheritance();  
		d.bark();  
		d.eat();
		d.weep();
	}
}  
