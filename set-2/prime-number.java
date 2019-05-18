import java.lang.*;
import java.util.Scanner;
class prime{
    void check(int start,int end)
    {
    for(int i=start;i<end;i++)
        {
            boolean flag = true;
        for(int j=2;j<i-1;j++)
        {
            if((i%j==0 ) && (i!= start))
            {
                flag = false;
                break;
            }
        }
        if((flag==true) &&(i!= start))
        {
            System.out.println(i);
        }
        }
    }
}


public class Main
{
    public static void main(String args[])
    {
        prime o = new prime();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        o.check(a,b);
        
           
    }
}
