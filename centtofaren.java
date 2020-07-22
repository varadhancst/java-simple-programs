import java.util.*;
public class centtofaren{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the centigrade: ");
    float c = input.nextFloat();
    double f = (1.8 * c + 32);
    System.out.println("The farenheit is : "+ f);

  }
}
