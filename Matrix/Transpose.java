import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. of Rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the No. of Columns: ");
        int col = sc.nextInt();
        int[][] arr  = new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int[][] c = new int[col][row];

        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                c[i][j] = arr[j][i];
            }
        }
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
