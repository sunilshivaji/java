import java.util.*;
class PrintSpiral 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the order of the matrix");
		int m=s.nextInt();
		int n=s.nextInt();
		int a[][]=new int[m][n];
		System.out.println("Enter array elements");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		int top=0,bottom=m-1;
		int left=0,right=n-1;

		while(true)
		{
			if(left>right)
				break;
			
			//top row
			for(int i=left;i<=right;i++)
			{
				System.out.print(a[top][i]+" ");
			}
			top++;

			if(top>bottom)
				break;
			
			//right column
			
			for(int i=top;i<=bottom;i++)
			{
				System.out.print(a[i][right]+" ");
			}
			right--;

			if(left>right)
				break;

			//print bottom row
			
			for(int i=right;i>=left;i--)
			{
				System.out.print(a[bottom][i]+" ");
			}
			bottom--;
			
			if(top>bottom)
				break;
			
			//print left column

			for(int i=bottom;i>=top;i--)
			{
				System.out.print(a[i][left]+" ");
			}
			left++;
		}
	}
}
