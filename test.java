import java.util.Scanner;

class sample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Prompt for integer input
    System.out.print("Enter integer value: ");
    int a = sc.nextInt();

    // Output the entered value
    System.out.println("integer value: " + a);

    // Close the scanner
    sc.close();
  }
}
