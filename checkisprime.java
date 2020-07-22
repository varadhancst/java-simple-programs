import java.util.Scanner;
class checkisprime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, flag = 0;
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        System.out.println("Entered number = " + n);
        if (n<=3) {
          flag = 0;
        }else{
            for(i = 2 ; i <= n / 2 ; i++)
            {
              if(n % i == 0)
              {
              flag = 1 ;
              break ;
              }
            }
        }
        if(flag == 1){
        System.out.println("\nThe number is not prime") ;}
        else{
        System.out.println("\nThe number is prime") ;}
        }
}
