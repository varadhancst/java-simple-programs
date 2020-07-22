import java.util.*;
class digitcount{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the digit: ");
    int n = input.nextInt();
    int count = 0;
    while(n > 0)
    {
      count++;
      n = n /10;
    }
    System.out.println("The number of digits is : " + count);
  }
}
