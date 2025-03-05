public class constructordemo
{
	int x;
	constructordemo()
	{
		x=10;
	}
	public static void main(String[] args)
	{
		constructordemo t1=new constructordemo();
		constructordemo t2=new constructordemo();
		System.out.println(t1.x+" "+t2.x);
	}
}
