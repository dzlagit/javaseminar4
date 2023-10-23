import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] integerArray = new int[10]; // Create an array to store the integers

    System.out.println("Please enter 10 integers:");

    int oddCount = 0; // Variable to store the count of odd numbers
    int evenCount = 0; // Variable to store the count of even numbers

    for (int i = 0; i < 10; i++) {
      System.out.print("Enter integer " + (i + 1) + ": ");
      if (scanner.hasNextInt()) {
        integerArray[i] = scanner.nextInt(); // Read an integer from the user and store it in the array

        if (integerArray[i] % 2 == 0) {
          evenCount++; // Increment even count if the number is even
        } else {
          oddCount++; // Increment odd count if the number is odd
        }

      } else {
        System.out.println("Invalid input. Please enter an integer.");
        i--; // Decrement i to re-enter the current value
      }
      scanner.nextLine(); // Consume the newline character
    }
    System.out.println("Number of even numbers: " + evenCount);
    System.out.println("Number of odd numbers: " + oddCount);

    scanner.close();
  }
}
