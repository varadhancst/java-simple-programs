import java.util.*;
class multiply {
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.print("Enter which table do you want: ");
     int table = input.nextInt();
     System.out.print("Enter the limit: ");
     int limit = input.nextInt();
     for (int i=1; i<=limit; i++ ) {
       System.out.println(i + " * " + table + " = " + (i * table));
     }
  }

}
