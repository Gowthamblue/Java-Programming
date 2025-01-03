import java.util.*;
class Spiralmatrix{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int r, c;
		System.out.print("Enter the Number of rows: ");
		r=sc.nextInt();
		System.out.println("Enter the Number of columns: ");
		c=sc.nextInt();
		int[][] matrix = new int[r][c];
		int top=0,bottom=r-1,left=0,right=c-1,d=1;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		
		while(top<=bottom && left<=right)
		{
			if(d==1)
			{
				for(int i=left;i<=right;i++)
				{
					System.out.print(matrix[top][i]+" ");
				}
			top++;
			}
			else if(d==2)
			{
				for(int i=top;i<=bottom;i++)
				{
					System.out.print(matrix[i][right]+" ");
				}
			right--;
			}
			else if(d==3)
			{
				for(int i=right;i>=left;i--)
				{
					System.out.print(matrix[bottom][i]+" ");
				}
			bottom--;
			}
			else if(d==4)
			{
				for(int i=bottom;i>=top;i--)
					{
						System.out.print(matrix[i][left]+" ");
					}
			left++;
			}
			d++;
			if(d==5)
			{
				d=1;
			}
		}
	}
}





