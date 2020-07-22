import java.util.*;
public class findquadrat{
  public static void main(String[] args) {
    double real, imag, r1, r2, n;
    float d;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the value of A: ");
    float a = input.nextFloat();
    System.out.print("Enter the value of B: ");
    float b = input.nextFloat();
    System.out.print("Enter the value of C: ");
    float c = input.nextFloat();
    if(a != 0)
    {
      d = b * b - 4 * a * c;
      System.out.println(d);
      if(d < 0)
      {
        System.out.println("Roots are imaginary");
        real = - b / (2 * a);
        d = - d;
        n = Math.pow(d, 0.5);
        imag = n / (2 * a);
        System.out.println("r1 = "+real+imag);
        System.out.println("r2 = "+real+imag);
      }
      if(d == 0)
      {
        System.out.println("Roots are real and equal");
        r1 = - b / (2 * a);
        System.out.println("r1 = r2 = "+ r1);
      }
      if(d > 0)
      {
        System.out.println("Roots are real and unequal");
        r1 = (- b + Math.sqrt(d)) / (2 * a);
        r2 = (- b - Math.sqrt(d)) / (2 * a);
        System.out.println("r1 = "+r1);
        System.out.println("r2 = "+r2);
      }
    }
    else
    {
      System.out.println("Equation is linear");
    }
  }
  }
