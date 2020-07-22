import java.util.*;
public class findncr {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    long ncr;
    System.out.print("Enter the value for N: ");
    int n = input.nextInt();
    System.out.print("Enter the value for R: ");
    int r = input.nextInt();
    if(n >= r)
    {
    ncr = fact(n) / (fact(n-r) * fact(r)) ;
    System.out.println("\nThe NCR value is :" + ncr) ;
    }
    else{
    System.out.println("\nCalculating NCR value is not possible") ;
    }
  }
  public static int fact(int i){
      int x;
      if(i == 0)
      {return 1;}
      else
      {
        x = i * fact(i - 1) ;
        return x ;
      }
    }
  }
