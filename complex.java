import java.util.Scanner;
public class complex
{
	int real;
	int imaginary;
	public complex(int real_get,int imag_get)
	{
		this.real=real_get;
		this.imaginary=imag_get;
	}
	public static complex sum(complex c1,complex c2)
	{
		complex temp=new complex(0,0);
		temp.real=c1.real+c2.real;
		temp.imaginary=c1.imaginary+c2.imaginary;
		return temp;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the real part of first complex number");
		int real1=sc.nextInt();
		System.out.println("enter the imaginary part of first complex number");
		int imag1=sc.nextInt();
		System.out.println("enter the real part of second complex number");
		int real2=sc.nextInt();
		System.out.println("enter the imaginary part of second complex number");
		int imag2=sc.nextInt();
		complex first=new complex(real1,imag1);
		complex second=new complex(real2,imag2);
		System.out.println("complex Numbers are");
		first.display();
		second.display();
		complex temp=sum(first,second);
		System.out.println("sum is :"+temp.real+"+"+temp.imaginary+"i");
	}
	public void display()
	{
		System.out.println(real+"+"+imaginary+"i");
	}
}
