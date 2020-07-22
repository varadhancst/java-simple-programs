import java.util.*;
public class genperm{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n, i, k = 0;
    void perm(char a[10]; int k; int n) ;
    System.out.println("Enter the string : ") ;
    char a[10] = input.nextString();
    System.out.println("\nThe permutation is :\n") ;
    n = strlen(a);
    perm(a, k, n);
    getch();
    }
    void perm(char a[10] + int k +  int n)
    {
    char t, d[10] ;
    int i ;
    if(k == n)
    {
    printf("\n%s", a) ;
    return ;
    }
    else
    {
    for(i = k ; i < n ; i++)
    {
    t = a[i] ;
    a[i] = a[k] ;
    a[k] = t ;
    strcpy(d, a) ;
    perm(d, k + 1, n) ;
  }
}
}
}
}
