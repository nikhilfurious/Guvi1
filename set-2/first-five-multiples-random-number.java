import java.lang.*;
import java.util.Scanner;
class multiples{
    int ans=0;
    void mul(int n)
    {
        for(int i=1;i<=5;i++)
        {
          ans = n * i;
          System.out.println(ans);
        }
}
}
public class Main
{
    public static void main(String args[])
    {
        multiples o = new multiples();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        o.mul(a);
        
           
    }
}
