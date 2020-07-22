import java.util.*;
public class calexp {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int exp;
    float sum = 1, t = 1 ;
    System.out.print("Enter the value for x: ");
    int x = input.nextInt();
    System.out.print("Enter the value for n: ");
    int n = input.nextInt();
    for(int i = 1 ; i < n + 1 ; i++)
    {
    exp = i;
    t = t * x / exp;
    sum = sum + t;
    }
    System.out.print("Exponential Value of " + x + " is :" + sum + "\n");
  }
}
