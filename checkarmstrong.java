import java.util.*;
class checkarmstrong{
  public static void main(String[] args) {
      int r, s = 0, t ;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the number :");
      int n = input.nextInt();
      System.out.println("Entered number : " + n);
      t = n ;
      while(n > 0)
      {
      r = n % 10 ;
      s = s + (r * r * r) ;
      n = n / 10 ;
      }
      if(s == t){
      System.out.println("\n is an armstrong number"+ t) ;
      }else{
      System.out.println("\n is not an armstrong number"+ t) ;}
  }
}
