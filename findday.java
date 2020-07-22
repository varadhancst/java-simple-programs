import java.util.*;
class findday {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String week[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
    System.out.println("Enter DOB: ");
    System.out.print("Enter date: ");
    int date = input.nextInt();
    System.out.print("Enter mon: ");
    int mon = input.nextInt();
    System.out.print("Enter year: ");
    int year = input.nextInt();
    int r, s = 0 ;
    if( (year / 4 == 0) && (year % 400 == 0) && (year % 100 != 0) )
    month[1] = 29;
    for(int i = 0; i < mon - 1; i++)
    s = s + month[i] ;
    s = s + (date + year + (year / 4) - 2) ;
    s = s % 7 ;
    System.out.println("\n The day is:" + week[s]);
  }
}
