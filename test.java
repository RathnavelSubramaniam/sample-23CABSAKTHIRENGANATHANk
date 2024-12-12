import java.util.Scanner;

class test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Display prompt exactly as required
    System.out.println("Enter integer value:");
    
    // Read integer input
    int a = sc.nextInt();
    
    // Display the output in the exact expected format
    System.out.println("integer value:" + a);
    
    // Close the scanner to release resources
    sc.close();
  }
}
