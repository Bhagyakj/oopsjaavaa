import java.util.Scanner;

public class le
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word:");
		String word=sc.nextLine();
		int len=word.length();
		System.out.println("length of "+ word +" is :"+len);
	}
}
