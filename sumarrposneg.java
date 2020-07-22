import java.util.Scanner;
public class sumarrposneg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the limit: ");
        int n = input.nextInt();
        int arr[]=new int[n];
        int sumpos = 0;
        int sumneg = 0;
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){//for reading array
            arr[i]=input.nextInt();
        }
        System.out.println("The positive elements are: ");
        for(int i: arr){ //for printing array
          if (i > 0) {
            sumpos = sumpos + i;
            System.out.print(i + "\t");
          }
        }
        System.out.println("\nThe sum of positive elements are: " + sumpos);
        System.out.println("\nThe negative elements are: ");
        for(int i: arr){ //for printing array
          if (i < 0) {
            sumneg = sumneg + i;
            System.out.print(i + "\t");
          }
        }
        System.out.println("\nThe sum of negative elements are: " + sumneg);
        System.out.print("\n");
    }
}
