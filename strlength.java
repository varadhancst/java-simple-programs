import java.util.Scanner;

class strlength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Getting String input
        System.out.print("Enter text: ");
        String myString = input.next();
        System.out.println("Text entered = " + myString);
        int result = myString.length();
          System.out.println("The length of the string:" + result);
            }
}
