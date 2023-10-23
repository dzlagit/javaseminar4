import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the first matrix
        double[][] matrix1 = inputMatrix("Enter the first 3x3 matrix:");

        // Input the second matrix
        double[][] matrix2 = inputMatrix("Enter the second 3x3 matrix:");

        // Check if matrix multiplication is possible
        if (matrix1 == null || matrix2 == null) {
            System.out.println("Invalid input. Please enter 3 values for each row.");
            return;
        }

        // Multiply the matrices
        double[][] resultMatrix = multiplyMatrices(matrix1, matrix2);

        // Display the result matrix
        System.out.println("Product of the two matrices:");
        displayMatrix(resultMatrix);
    }

    // Function to input a 3x3 matrix from the user
    public static double[][] inputMatrix(String prompt) {
        System.out.println(prompt);
        double[][] matrix = new double[3][3];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String[] row = input.nextLine().split(" ");

            if (row.length != 3) {
                return null;
            }

            for (int j = 0; j < 3; j++) {
                matrix[i][j] = Double.parseDouble(row[j]);
            }
        }

        return matrix;
    }

    // Function to multiply two matrices
    public static double[][] multiplyMatrices(double[][] matrix1, double[][] matrix2) {
        double[][] resultMatrix = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return resultMatrix;
    }

    // Function to display a 3x3 matrix
    public static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
      scanner.close();
    }
}
