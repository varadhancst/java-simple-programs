import java.util.Scanner;
public class arrpos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the limit: ");
        int n = input.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements");
        for(int i=0;i<n;i++){//for reading array
            arr[i]=input.nextInt();
        }
        System.out.println("The positive elemnts are: ");
        for(int i: arr){ //for printing array
          if (i > 0) {
            System.out.print(i + "\t");
          }
        }
        System.out.print("\n");
    }
}
