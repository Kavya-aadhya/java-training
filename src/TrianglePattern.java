package src;

public class TrianglePattern
{
    public static void main(String args[])
    {

        int i, j,rows= 5;
//loop for rows
        for (i=0; i<rows; i++)
        {
//loop for columns
            for (j=2*(rows-i); j>1; j--)
            {
                System.out.print(" ");
            }
//inner loop for columns
            for (j=0; j<=2*i; j++ )
            {
//prints star
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
}
