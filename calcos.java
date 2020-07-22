import java.util.*;
public class calcos{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double val, sum = 1, t = 1 ;
    System.out.println("Enter the value for x: ");
    double x = input.nextDouble();
    System.out.println("Enter the value for n: ");
    double n = input.nextDouble();
    val = x;
    x = x * 3.14159 / 180;
    for(int i = 1 ; i < n + 1 ; i++)
    {
    t = t * Math.pow((double) (-1), (double) (2 * i - 1)) *
    x * x / (2 * i * (2 * i - 1)) ;
    sum = sum + t ;
    }
    System.out.println("\nCosine value of "+ val + " is :"+ sum) ;

    }
  }
