import java.util.*;
public class findlcmgcd{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int prod,gcd,lcm;
    System.out.print("Enter the n1 value: ");
    int n1 = input.nextInt();
    System.out.print("Enter the n2 value: ");
    int n2 = input.nextInt();
    prod = n1 * n2;
    while(n1 != n2)
    {
      if(n1 > n2)
      n1 = n1 - n2;
      if(n2 > n1)
      n2 = n2 - n1;
    }
    gcd = n1 ;
    lcm = prod / gcd;
    System.out.print("The GCD is : "+ gcd);
    System.out.print("\nThe LCM is : "+ lcm + "\n");

  }
}
