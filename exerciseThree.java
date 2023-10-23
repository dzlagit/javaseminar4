import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize a 4x4 matrix (2D array)
        int[][] matrix = new int[4][4];

        // Fill the matrix with user input
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter the element at row " + (i + 1) + ", column " + (j + 1) + ": ");
                if (scanner.hasNextInt()) {
                    matrix[i][j] = scanner.nextInt();
                } else {
                    System.out.println("Invalid input. Please enter an integer value.");
                    j--; // Decrement j to re-enter the current element
                }
            }
        }

        // Calculate the sum of the major diagonal elements
        int diagonalSum = 0;
        for (int i = 0; i < 4; i++) {
            diagonalSum += matrix[i][i];
        }

        // Calculate the average of the major diagonal elements
        double diagonalAverage = (double) diagonalSum / 4; // Cast to double for the average

        // Print the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Print the average of the major diagonal
        System.out.println("Average of the major diagonal elements: " + diagonalAverage);
    }
}
