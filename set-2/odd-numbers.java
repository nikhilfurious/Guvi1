import java.lang.*;
import java.util.Scanner;
class Odd{
    void check(int strating_number,int ending_number)
    {
        for(int i=strating_number;i<ending_number;i++)
        {
            if(i%2 != 0 && i!=1)
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
        Odd o = new Odd();
        Scanner sc = new Scanner(System.in);
        int st_no = sc.nextInt();
        int end_no = sc.nextInt();
        o.check(st_no,end_no);
    }
}
