import java.util.*;
class divisors{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the limit: ");
    int n = input.nextInt();
    System.out.println("The divisible numbers of given number are:");
    for (int i = 1;i <= n ; i++ ) {
      if (n % i == 0) {
        System.out.println(i);
      }
    }
  }

}
