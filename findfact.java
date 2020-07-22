import java.util.*;
public class findfact{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int n = input.nextInt();
    int s = 0;
    int t = 1;
    for (int i = n;i>0 ;i-- ) {
      s = i;
      t = t * s;
      System.out.println(i);
    }
    System.out.println("factorial value of " + n + " is: " + t);
  }
}
