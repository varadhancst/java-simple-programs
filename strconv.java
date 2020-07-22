import java.util.Scanner;

class strconv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting String input
        System.out.print("Enter text: ");
        String myString = input.next();
        System.out.println("Text entered = " + myString);
        String result = myString.toLowerCase();
          System.out.println("The lowercase of the string:" + result);
            }
}
