import java.util.Scanner;

class checkoddeven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting String input
        System.out.print("Enter number: ");
        int n = input.nextInt();
        System.out.println("Number entered = " + n);
        if (n % 2 == 0) {
          System.out.println("\n The given no is even :\n"+ n);
        }else{
          System.out.println("\n The given no is odd :\n" + n);
        }
        }
}
