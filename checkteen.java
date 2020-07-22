import java.util.Scanner;
class checkteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting String input
        System.out.print("Enter age: ");
        int n = input.nextInt();
        System.out.println("Age entered = " + n);
        if (n >= 13 && n <= 19) {
          System.out.println("\n The person is in teen age:\n"+ n);
        }else{
          System.out.println("\n The person is not in teen age:\n" + n);
        }
        }
}
