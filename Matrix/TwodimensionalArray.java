import java.util.*;
public class TwodimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the No. of Rows: ");
        int row = sc.nextInt();
        System.out.print("Enter the No. of Columns: ");
        int col = sc.nextInt();
        int[][] arr  = new int[row][col];
        int count = 1;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = count;
                count++;
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}