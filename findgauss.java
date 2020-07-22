import java.util.*;
public class findgauss{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number of equations: ");
    int n = input.nextInt();
    int i, j, k, n;
    float a[20][20];
    float x[20];
    double s, p;
    System.out.println("\nEnter the co-efficients of the equations :\n\n") ;
    for(i = 0; i < n ; i++)
    {
    for(j = 0; j < n ; j++)
    {
    System.out.println("a[%d][%d] = ", i + 1, j + 1) ;
    }
    System.out.println("b[%d] = ", i + 1) ;
    }
    for(k = 0 ; k < n - 1 ; k++)
    {
    for(i = k + 1 ; i < n ; i++)
    {
    p = a[i][k] / a[k][k] ;
    for(j = k ; j < n + 1 ; j++)
    a[i][j] = a[i][j] - p * a[k][j] ;
    }
    }
    x[n-1] = a[n-1][n] / a[n-1][n-1] ;
    for(i = n - 2 ; i >= 0 ; i--)
    {
    s = 0 ;
    for(j = i + 1 ; j < n ; j++)
    {
    s += (a[i][j] * x[j]) ;
    x[i] = (a[i][n] - s) / a[i][i] ;
    }
    }
    System.out.println("\nThe result is :\n") ;
    for(i = 0 ; i < n ; i++)
    System.out.println("\nx[%d] = %.2f", i + 1, x[i]) ;


  }
}
