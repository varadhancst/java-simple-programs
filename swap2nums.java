import java.util.*;
class swap2nums {
public static void main(String[] args)
{
Scanner input = new Scanner(System.in);
System.out.print("Enter a value:");
int a = input.nextInt();
System.out.print("Enter b value:");
int b = input.nextInt();
System.out.println("Before swapping a = "+ a + " and b = " + b);
a = a + b;
b = a - b;
a = a - b;
System.out.println("After swapping a = "+ a + " and b = " + b);
}
}
