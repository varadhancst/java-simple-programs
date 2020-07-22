import java.util.*;
class arithuseswitch {
public static void main(String args[]) {
Scanner input = new Scanner(System.in);
System.out.println("Enter the first value: ");
int a = input.nextInt();
System.out.println("Enter the second value: ");
int b = input.nextInt();
System.out.println("Enter option 1 = add, 2 = sub, 3 = mul, 4 = div");
int c = input.nextInt();
switch (c) {
  case 1:
  System.out.println(a + b);
  break;
  case 2:
  System.out.println(a - b);
  break;
  case 3:
  System.out.println(a * b);
  break;
  case 4:
  System.out.println(a / b);
  break;
  default:
  System.out.println("error");
  break;
}
}
}
