import java.util.Arrays;
import java.util.Scanner;
public class sort
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of strings :\n");
		int n=sc.nextInt();
		String[] strings=new String[n];
		System.out.println("Enter the strings :");
		for(int i=0;i<n;i++)
		{
			strings[i]=sc.next();
		}
		Arrays.sort(strings);
		System.out.println("\nsorted strings :");
		for(String str : strings)
		{
			System.out.println(str);
		}
		sc.close();
	}
}
