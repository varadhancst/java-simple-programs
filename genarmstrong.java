import java.util.*;
public class genarmstrong{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, r, s;
    System.out.print("Enter the limit: ");
    int n = input.nextInt();
    System.out.println("The armstrong numbers are: ");
    for (int i = 0; i<=n; i++ ) {
      a = i;
      s = 0;
      while(a > 0)
      {
      r = a % 10;
      s = s + (r * r * r);
      a = a / 10;
      }
      if(i == s)
      System.out.println(i);
    }
  }
}
