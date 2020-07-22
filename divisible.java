import java.util.*;
class divisible{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the limit: ");
    int n = input.nextInt();
    System.out.print("Enter the divisible number: ");
    int d = input.nextInt();
    System.out.println("The divisible numbers are");
    for (int i = 1;i <= n ;i ++ ) {
      if (i % d == 0) {
        System.out.println(i);
      }
    }
  }
}
