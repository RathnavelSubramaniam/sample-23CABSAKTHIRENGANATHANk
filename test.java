import java.util.Scanner;

class test {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Prompt for input
    System.out.print("Enter integer value: ");
    
    // Read integer value
    int a = sc.nextInt();
    
    // Output the result in the required format
    System.out.println("integer value:" + a);
    
    // Close the scanner
    sc.close();
  }
}
