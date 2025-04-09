class anim
{
	String name;
	String category;
	public void showdetails()
	{
		System.out.println("Name:"+name);
		System.out.println("Category:"+category);
	}
}
class Dog extends anim{
}
class Cat extends anim{
}
public class Animal
{
	public static void main(String[] args)
	{
		Dog d1=new Dog();
		d1.name="Tommy";
		d1.category="shitzu";
		d1.showdetails();
		Cat c1=new Cat();
		c1.name="coco";
		c1.category="persyan cat";
		c1.showdetails();
	}
}
		
		
