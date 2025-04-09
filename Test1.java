class Animal
{
	public void eat()
	{
		System.out.println("animal eats");
	}
}
class Tiger extends Animal
{
}
public class Test1
{
	public static void main(String[] args)
	{
		Tiger t=new Tiger();
		t.eat();
	}
}
