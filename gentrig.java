import java.util.*;
public class gentrig{
  public static void main(String[] args) {
    double r;
    int i;
    char ch;
    System.out.println("- - - - - - - - - - - - - - - - - -");
    System.out.println("\nAngle \t Sin \t Cos \t Tan \n");
    System.out.println("- - - - - - - - - - - - - - - - - -");
    for(i = 0; i <= 180; i = i + 30)
    {
    r = i * 3.14159 / 180;
    System.out.println("\n  \t  \t  \t \n"+  i + Math.sin(r)+ Math.cos(r) + Math.tan(r));
    }
    System.out.println("- - - - - - - - - - - - - - - - - -");
  }
}
