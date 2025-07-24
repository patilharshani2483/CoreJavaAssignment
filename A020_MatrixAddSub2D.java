//Write a program to perform matrix addition and subtraction using 2D arrays.
package JavaAssignment;

public class A020_MatrixAddSub2D 
{

	    public static void main(String[] args)
	    {
	        int[][] matrix1 = {{1, 2}, {5, 7}};
	        int[][] matrix2 = {{9, 8}, {10, 5}};

	        // Store Results
	        int[][] sum = new int[2][2];
	        int[][] store = new int[2][2];

	        for (int i = 0; i < 2; i++)
	        {
	            for (int j = 0; j < 2; j++)
	            {
	                sum[i][j] = matrix1[i][j] + matrix2[i][j];
	                store[i][j] = matrix1[i][j] - matrix2[i][j];  // Fix: use matrix1 - matrix2
	            }
	        }

	        System.out.println("Matrix 1:");
	        printMatrix(matrix1);
	        System.out.println();

	        System.out.println("Matrix 2:");
	        printMatrix(matrix2);
	        System.out.println();


	        System.out.println("Matrix Addition:");
	        printMatrix(sum);
	        System.out.println();


	        System.out.println("Matrix Subtraction:");
	        printMatrix(store);
	        System.out.println();

	    }

	    public static void printMatrix(int[][] matrix)
	    {
	        for (int[] row : matrix)
	        {
	            for (int val : row)
	            {
	                System.out.print(val + "\t");
	            }
	            System.out.println();
	        }
	    }
	}


