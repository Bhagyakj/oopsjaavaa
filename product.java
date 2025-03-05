public class product
{
	String pcode;
	String pname;
	int price;
	public product(String pcode,String pname,int price)
	{
		this.pcode=pcode;
		this.pname=pname;
		this.price=price;
	}
	public static void findLowest(product[] products)
	{
		product minProduct=products[0];
		for(product p:products)
		{
			if(p.price<minProduct.price)
			{
				minProduct=p;
			}
		}
		System.out.println("lowest priced product ID is:"+minProduct.pcode);
	}
	public static void main(String[] args)
	{
		product[] products={new product ("A123","TV",200),new product("B123","Radio",2100),new product("C123","DVD",300)
		};
	findLowest(products);
	}
}
