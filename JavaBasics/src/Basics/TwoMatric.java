package JavaBasics;
import java.util.Scanner;
public class TwoMatric {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the dimensions of the matrices
	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();
	        System.out.print("Enter the number of columns: ");
	        int columns = scanner.nextInt();

	        // Create two matrices
	        int[][] matrixA = new int[rows][columns];
	        int[][] matrixB = new int[rows][columns];

	        // Input elements for the first matrix
	        System.out.println("Enter elements for the first matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                matrixA[i][j] = scanner.nextInt();
	            }
	        }

	        // Input elements for the second matrix
	        System.out.println("Enter elements for the second matrix:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                matrixB[i][j] = scanner.nextInt();
	            }
	        }

	        // Calculate the sum of the matrices
	        int[][] sumMatrix = new int[rows][columns];
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
	            }
	        }

	        // Display the result
	        System.out.println("Sum of the matrices:");
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                System.out.print(sumMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }

	        scanner.close();
	    }
	}


