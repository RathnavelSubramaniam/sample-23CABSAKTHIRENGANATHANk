import java.util.Scanner;

class Test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Scanner for user input
    System.out.println("Enter integer value:"); // Prompt for input
    int a = sc.nextInt(); // Read integer input
    System.out.println("integer value: " + a); // Output the entered value
    sc.close(); // Close the scanner to release resources
  }
}
