import java.util.*;
class multitable {
public static void main(String args[]) {
Scanner input = new Scanner(System.in);
System.out.print("Enter the table from value: ");
int a = input.nextInt();
System.out.print("Enter the table last value: ");
int b = input.nextInt();
for (int i=a;i<=b ;i++ ) {
  for (int j=a;j<=b ;j++ ) {
    System.out.print(i * j + "\t");
  }
System.out.print("\n");
}
}
}
