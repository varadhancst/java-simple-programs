import java.util.*;
class checkissquare{
  public static void main(String[] args) {
    double m;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int n = input.nextInt();
    double p;
    p = Math.sqrt(n);
    m = p;
    if (p == Math.floor(m)) {
      System.out.println(n + " given no is perfect square");
    }else{
      System.out.println(n + " given no is not perfect square");
    }
  }
}
