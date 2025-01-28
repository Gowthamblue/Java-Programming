import java.util.Scanner;

public class M3X3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. of Rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the No. of Columns: ");
        int col = sc.nextInt();
        int[][] arr  = new int[row][col];
        System.out.println("Enter the First Matrix.");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter the Second Matrix.");
        System.out.print("Enter the No. of Rows: ");
        int row1 = sc.nextInt();
        System.out.print("Enter the No. of Columns: ");
        int col1 = sc.nextInt();
        int[][] arr1 = new int[row1][col1];
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                arr1[i][j] = sc.nextInt();
            }
        }
        int[][] c = new int[row][col1];
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                c[i][j]=0;
                for(int k=0;k<col;k++)
                {
                    c[i][j] += arr[i][k] * arr1[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
}
