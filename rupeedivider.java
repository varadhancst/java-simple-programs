import java.util.*;
class rupeedivider {
public static void main(String args[]) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the amount: ");
int amount = input.nextInt();
System.out.println("The amount is :" + amount);
while (amount >= 1)
{
  amount = amount - (amount % 1);
  System.out.println("the no of one rupee is :" + amount / 1);
  break;
}
while (amount >= 2)
{
  amount = amount - (amount % 2);
  System.out.println("the no of two rupee is :" + amount / 2);
  break;
}
while (amount >= 5)
{
  amount = amount - (amount % 5);
  System.out.println("the no of five rupee is :" + amount / 5);
  break;
}
while (amount >= 10)
{
  amount = amount - (amount % 10);
  System.out.println("the no of ten rupee is :" + amount / 10);
  break;
}
while (amount >= 50)
{
  amount = amount - (amount % 50);
  System.out.println("the no of fifty rupees is :" + amount / 50);
  break;
}
while (amount >= 100)
{
  amount = amount - (amount % 100);
  System.out.println("the no of hundred rupees is :" + amount / 100);
  break;
}
while (amount >= 500)
{
  amount = amount - (amount % 500);
  System.out.println("the no of five hundred rupees is :" + amount / 500);
  break;
}
while (amount >= 2000)
{
  amount = amount - (amount % 2000);
  System.out.println("the no of two thousands rupees is :" + amount / 2000);
  break;
}
}
}
