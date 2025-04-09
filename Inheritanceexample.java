class Animal
{
	String name;
	void makesound()
	{
		System.out.println("some generic sound");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println(name+"says : woof ! woof ");
	}
}
public class Inheritanceexample
{
	public static void main(String[] args)
	{
		Dog d1=new Dog();
		d1.name="zozu";
		d1.bark();
		d1.makesound();
	}
}

