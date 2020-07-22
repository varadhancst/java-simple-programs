import java.util.*;
public class dectobin{
  public static void main(String[] args) {
    long b[20];
    int r, c = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a decimal number: ");
    int n = input.nextInt();
    while (n>0)
    {
      r = n % 2 ;
      b[c] = r ;
      n = n / 2 ;
      c++ ;
    }
    System.out.println("\nThe binary equivalent is : ");
    for( int i = c - 1 ; i >= 0 ; i--){
    System.out.println(b[i]);
  }
  }
}
