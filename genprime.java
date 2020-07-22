import java.util.*;
public class genprime{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the limit: ");
    int n = input.nextInt();
    System.out.println("The prime numbers are: ");
    for (int i = 1 ; i <= n; i++)
    {
    if(i <= 3)
    {
    System.out.println(i);
    }
    else
    {
    for (int j = 2; j <= i/2 ; j++)
    {
    if (i % j == 0)
    System.out.println(i);
    break;
    }
    }
    }
    }
  }
