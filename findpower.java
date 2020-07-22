import java.util.*;
public class findpower{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int count = 1;
    int sum = 1;
    System.out.print("Enter the value of X: ");
    int x = input.nextInt();
    System.out.print("Enter the value of N: ");
    int n = input.nextInt();
    while(count<=n){
      sum = sum * x;
      count++;
    }
    System.out.println("The power of" + x + "^" + n + "is: " + sum);
  }
}
