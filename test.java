import java.util.Scanner;

class Test {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter integer value:");
    int a = sc.nextInt();
    System.out.println("integer value:" + a);
    sc.close(); // Ensure resources are released
  }
}
