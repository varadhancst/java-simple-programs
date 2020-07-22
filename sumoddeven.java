import java.util.*;
class sumoddeven{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the limit: ");
    int n = input.nextInt();
    int osum = 0;
    System.out.print("The odd numbers are: \t");
    for (int i=0;i<=n ;i++ ) {
      if (i % 2 == 1) {
        System.out.print(i + "\t");
        osum = osum + i;
      }
    }
    System.out.println("\n sum of odd numbers: " + osum);
    int esum = 0;
    System.out.print("The even numbers are: \t");
    for (int i=0;i<=n ;i++ ) {
      if (i % 2 == 0) {
        System.out.print(i + "\t");
        esum = esum + i;
      }
    }
    System.out.println("\n sum of even numbers: " + esum);
  }
}
