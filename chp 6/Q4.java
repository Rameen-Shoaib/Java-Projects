public class Q4
{
    public static void main(String[] args)
    {
        int [][] mat = {{1, 2, 3}, {4, 5, 6}};
        int [][] mat2 = {{7, 8, 9}, {10, 11, 12}};
        int [][] result = new int [2][3];
        for (int i = 0; i < mat.length; i++) // row number of times
        {
            for (int j = 0; j < mat[i].length; j++) // column number of times
            {
                result [i][j] = mat[i][j] + mat2[i][j];                
                System.out.print(result [i][j] + " ");
            }
            System.out.println("");
        }
    }
}
