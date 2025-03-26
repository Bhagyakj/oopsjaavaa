public class pro
{
	String pcode;
	String pname;
	int price;
public pro(String pcode,String pname,int price)
{
	this.pcode=pcode;
	this.pname=pname;
	this.price=price;
}
public void display()
{
	System.out.println("peoduct code:"+pcode);
	System.out.println("peoduct name:"+pname);
	System.out.println("peoduct price:"+price);
	System.out.println();
}
public static void main(String[] args)
{
	pro p1=new pro("A01","AC",25000);
	pro p2=new pro("A02","TV",35000);
	pro p3=new pro("A03","FAN",8000);
	
	pro minpro=p1;
	if(p2.price<p1.price)
	{
		minpro=p2;
	}
	else
	{
		minpro=p3;
	}
	System.out.println("the product with lowest price is :"+minpro);
	minpro.display();
}
}
		
