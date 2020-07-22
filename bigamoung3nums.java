import java.util.*;
class bigamoung3nums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = input.nextInt();
        System.out.print("Enter the number: ");
        int b = input.nextInt();
        System.out.print("Enter the number: ");
        int c = input.nextInt();
        System.out.println("you have entered the values :" + " " + a + " " + b + " " + c);
        if (a > b) {
          if (a > c) {
            System.out.println(a + " is the biggest number");
          }
          else  {
            System.out.println(c + "  is the biggest number");
          }
        }
        else  {
          if (c > b) {
            System.out.println(c + "  is the biggest number");

          }else
          {
            System.out.println(b + "   is the biggest number");
          }
        }
    }
}
