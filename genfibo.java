import java.util.*;
class genfibo{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = -1, b = 1, c = 0, sum = 0;
    System.out.print("Enter the limit: ");
    int n = input.nextInt();
    for (int i = 1; i<=n ;i++ ) {
      c = a +b;
      System.out.print(c + "\t");
      sum = sum + c;
      a = b;
      b = c;
    }
      System.out.println("\n The sum of the fibonacci series is: " + sum);
  }
}
