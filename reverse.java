import java.util.*;
class reverse{
  public static void main(String[] args) {
    long r,s = 0;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    long n = input.nextLong();
    while (n > 0){
      r = n % 10 ;
      s = r + s * 10 ;
      n = n / 10 ;
    }
    System.out.println("The reverse number is :"+ s);
  }
}
