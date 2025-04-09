class person
{
	String name;
	int phone;
	public void showAddress()
	{
		System.out.println("Name:"+name);
		System.out.println("Phone:"+phone);
	}
}
class Teacher extends person{
}
class Students extends person{
}
class Staff extends person{
}
public class main{
	public static void main(String[] args)
	{
		Teacher t1=new Teacher();
		t1.name="john";
		t1.phone=12324;
		t1.showAddress();
		Students s1=new Students();
		s1.name="Anil";
		s1.phone=66246;
		s1.showAddress();
		Staff st1=new Staff();
		st1.name="aishu";
		st1.phone=78875;
		st1.showAddress();
	}
}
