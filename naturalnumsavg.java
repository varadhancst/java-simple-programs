import java.util.*;
class naturalnumsavg{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the limit: ");
    int n = input.nextInt();
    int sum = 0;
    for (int i=1;i<=n ;i++ ) {
      System.out.println(i);
      sum = sum + i;
    }
    System.out.println("Total of first " + n + "numbers is : " + sum + " and the average is equal to " + sum + "/" + n + " = " + sum / n);
    
  }
}
