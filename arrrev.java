import java.util.*;
public class arrrev{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the limit: ");
      int n = input.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter the elements: ");
      for (int i = 0; i<n; i++ ) {
        arr[i] = input.nextInt();
      }
      System.out.print("The array values are: ");
      for(int i: arr){ //for printing array
        if (i > 0) {
          System.out.print(i + "\t");
        }
      }
      System.out.print("\nThe reverse array are: ");
      for (int i = n-1; i>=0; i-- ) {
        System.out.print(arr[i] + "\t");
      }
      System.out.println();
  }
}
