import java.util.Scanner;
public class mark
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mark");
		int mark=sc.nextInt();
		switch(mark/10)
		{
			case 10:
				System.out.println("A+");
				break;
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B+");
				break;
			case 7:
				System.out.println("B");
				break;
			case 6:
				System.out.println("C+");
				break;
			case 5:
				System.out.println("C");
				break;
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("FAIL");
				break;
			default:
				System.out.println("invalid option");
				break;
			}
		}
	}
	
				
