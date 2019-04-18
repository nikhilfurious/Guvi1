import java.util.Scanner;
 class checker{
    int flag;
    void prime(int n)
    {
        int m=n/2;
        for(int i=2;i<m;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
            if(flag==0)
            {
                System.out.println("prime");
            }
            else{
                System.out.println("no");
            }
        
    }
}
public class Main{
public static void main(String args[])
{
Scanner sc =  new Scanner(System.in);
int n = sc.nextInt();
checker o = new checker();
o.prime(n);
}
}
