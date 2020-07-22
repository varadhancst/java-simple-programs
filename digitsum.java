import java.util.*;
class digitsum{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the digits: ");
    int n = input.nextInt();
    int r, s = 0;
    while(n > 0){
      r = n % 10;
      s = s + r;
      n = n / 10;
    }
    System.out.println("The sum of digits is :" + s);
  }
}
