import java.util.*;
public class genpascal{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int x;
    int q = 0;
    int b = 1;
    System.out.print("Enter the number of rows: ");
    int p = input.nextInt();
    System.out.println("Pascal's triangle is: ");
    while (q < p)
    {
    for(int r = 40 - 3 * q ; r > 0 ; --r)
    System.out.print(" ");
    for(x = 0 ; x <= q ; ++x)
    {
    if((x == 0) || (q == 0))
    b = 1;
    else
    b = (b * (q - x + 1)) / x;
    System.out.print(b + "\t");}
    System.out.print("\n");
    ++q;
    }
  }
}
