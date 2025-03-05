import java.util.Scanner;
public class matrix
{
	int row;
	int column;
	int[][] array;
	public matrix()
	{
		array=new int[10][10];
	}
	public void getMatrix()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of matrix,row count:");
		this.row=sc.nextInt();
		System.out.println("enter the size of matrix,column count:");
		this.column=sc.nextInt();
		System.out.println("enter the matrix elements:");
		for(int rc=0;rc<this.row;rc++)
		{
			for(int cc=0;cc<this.column;cc++)
			{
				this.array[rc][cc]=sc.nextInt();
			}
		}
		sc.close();
	}
	public void isSymmetric()
	{
		if(this.row!=this.column)
		{
			System.out.println("Matrix is not square,hence not symmetric.");
			return;
		}
		
		for(int rc=0;rc<this.row;rc++)
		{
			for(int cc=rc+1;cc<this.column;cc++)
			{
				if(this.array[rc][cc]!=this.array[cc][rc])
				{
					System.out.println("Matrix is not symmetric");
					return;
				}
			}
		}
			System.out.println("Matrix is symmetric.");
	}
	public static void main(String[] args)
	{
		matrix first=new matrix();
		first.getMatrix();
		first.isSymmetric();
		System.out.println("-------END------");
	}
}
					
