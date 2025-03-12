import java.util.Scanner;
public class cha
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word:");
		String word=sc.nextLine();
		char ch=word.charAt(3);
		System.out.println(" perticular charecter is :"+ch);
	}
}
