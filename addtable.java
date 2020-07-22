import java.util.*;
class addtable{
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter which table want: ");
     int table = input.nextInt();
     System.out.println("Enter the limit: ");
     int limit = input.nextInt();
     for (int i=1;i<=limit ;i++ ) {
       System.out.println(i + " + " + table + " = " + (i + table)+  "\n");
     }

  }
}
