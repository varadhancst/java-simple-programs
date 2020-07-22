import java.util.*;
public class printascii{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("ASCII chart for characters: ");
    char ch;
    for(ch = 65 ; ch <= 122 ; ch++)
    {
    if(ch > 90 && ch < 97)
    continue ;
    int i = ch;
    System.out.println(ch + "\t" + i);
    
    }

  }
}
