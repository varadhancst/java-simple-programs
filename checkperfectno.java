
import java.util.Scanner;
class checkperfectno {
    public static void main(String[] args) {
            int i, s = 0 ;
        Scanner input = new Scanner(System.in);

        // Getting String input
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        System.out.println("Number entered = " + n);
        for(i = 1 ; i < n ; i++)
        {
        if(n % i == 0)
        s = s + i ;
        }
        if (s == n){
        System.out.println(n + " is a perfect number") ;
        }else{
        System.out.println(n + " is not a perfect number") ;}

        }
}


/*class checkperfectno{
  public static void main(String[] args) {
    int i, s = 0 ;
    int n = 12;
    for(i = 1 ; i < n ; i++)
    {
    if(n % i == 0)
    s = s + i ;
    }
    if (s == n){
    System.out.println(n + " is a perfect number") ;
    }else{
    System.out.println(n + " is not a perfect number") ;}

    }
}
*/
