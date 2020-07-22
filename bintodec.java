import java.util.*;
public class bintodec{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the binary number: ");
    int n = input.nextInt();
    System.out.println("you have entered: " + n);
    int i = 0, j = 0;
    double sum = 0;
    if(n != 0)
    {
    i = n % 10;
    if(i == 0 || i == 1)
    {
    while(n != 0)
    {
    i = n % 10;
    sum = sum + i * Math.pow(2, j);
    n = n / 10;
    j ++ ;
    }
    }
    }

    if(sum == 0){
    System.out.println("\nThe number is not a binary number");
    }else{
    System.out.println("\nThe equivalent decimal number is : "+ sum);
  }

  }
}
