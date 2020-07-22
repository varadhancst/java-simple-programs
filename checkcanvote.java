import java.util.Scanner;
class checkcanvote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting String input
        System.out.print("Enter age: ");
        int n = input.nextInt();
        System.out.println("Age entered = " + n);
        if (n >= 18) {
          System.out.println("\n The person is eligible to vote :\n"+ n);
        }else{
          System.out.println("\n The person is not eligible to vote :\n" + n);
        }
        }
}
    
