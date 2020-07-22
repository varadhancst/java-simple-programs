import java.util.*;
public class farentocent{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the farenheit: ");
    float f = input.nextFloat();
    double c = (f-32)/1.8;
    System.out.println("The centigrade is : "+ c);

  }
}
