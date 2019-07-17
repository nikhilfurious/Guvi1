import java.util.Scanner;
public class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r;
        int m;
        if(n<60)
        {
            System.out.println(0 +" "+n);
        }
        else
        {
          r = n%60;
          m = n/60;
          System.out.println(m+" "+r);
         }
    }
}
