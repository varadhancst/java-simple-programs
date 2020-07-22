import java.util.*;
class findbigternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a = input.nextInt();
        System.out.print("Enter b value: ");
        int b = input.nextInt();
        System.out.print("Enter c value: ");
        int c = input.nextInt();
        System.out.println("you have entered the values :" + " " + a + " " + b + " " + c);
        int big = a > b ? (a > c ? a : c) : (b > c ? b : c) ;
        System.out.println("Result is " + big);
    }
}
