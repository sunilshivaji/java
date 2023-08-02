import java.util.*;
class FillSpiral 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the order of the matrix");
		int m=s.nextInt();
		int n=s.nextInt();
		int a[][]=new int[m][n];
		int x=1;
		int top=0,bottom=m-1;
		int left=0,right=n-1;

		while(true)
		{
			if(left>right)
				break;
			
			//top row
			for(int i=left;i<=right;i++)
			{
				a[top][i]=x++;
			}
			top++;

			if(top>bottom)
				break;
			
			//right column
			
			for(int i=top;i<=bottom;i++)
			{
				a[i][right]=x++;
			}
			right--;

			if(left>right)
				break;

			//print bottom row
			
			for(int i=right;i>=left;i--)
			{
				a[bottom][i]=x++;
			}
			bottom--;
			
			if(top>bottom)
				break;
			
			//print left column

			for(int i=bottom;i>=top;i--)
			{
				a[i][left]=x++;
			}
			left++;
		}

		System.out.println("The matrix is");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}