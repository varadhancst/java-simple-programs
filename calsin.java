import java.util.*;
public class calsin{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

double val, sum, t ;
System.out.print("Enter the value for x : ");
double x = input.nextDouble();
System.out.print("\nEnter the value for n : ");
double n = input.nextDouble();
val = x ;
x = x * 3.14159 / 180 ;
t = x ;
sum = x ;
for(int i = 1 ; i < n + 1 ; i++)
{
t = (t * Math.pow((double) (-1), (double) (2 * i - 1)) * x * x) / (2 * i * (2 * i + 1));
sum = sum + t ;
}
System.out.println("\nSine value of " +val +   "is : "+ sum);

    }
  }
