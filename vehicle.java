class vehi
{
	String colour;
	String brand;
	void tyres()
	{
		System.out.println("colour :"+colour);
		System.out.println("brand :"+brand);
		System.out.println("number of tyres:4");
	}
}
class Car extends vehi{
}
public class vehicle
{
	public static void main(String[] args)
	{
		Car c1=new Car();
		c1.brand="BMW";
		c1.colour="black";
		c1.tyres();
	}
}
