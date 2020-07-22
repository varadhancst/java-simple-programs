import java.util.*;
public class genfloyd{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int c = 1;
    System.out.print("Enter the number of rows: ");
    int r = input.nextInt();
    System.out.print("Floyd's triangle is: \n\n");
    for(int i = 0 ; i < r ; i++)
    {
    for(int j = 0 ; j <= i ; j++)
    {
    System.out.print(c + "\t") ;
    c++ ;
    }
    System.out.print("\n\n") ;
    }
  }
}
