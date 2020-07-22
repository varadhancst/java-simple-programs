import java.util.*;
class swap2nums3var {
public static void main(String args[]) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a value: ");
int a = input.nextInt();
System.out.print("Enter b value: ");
int b = input.nextInt();
int c;
System.out.println("Before swapping a = "+ a + " and b = " + b);
c = a;
a = b;
b = c;
System.out.println("After swapping a = "+ a + " and b = " + b);
}
}
