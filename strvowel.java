import java.util.*;
public class strvowel{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the character:");
    char c = input.next().charAt(0);

  if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
      System.out.println(c + " is a vowel");
    }else{
      System.out.println(c + " is not a vowel");
    }
  }
}
