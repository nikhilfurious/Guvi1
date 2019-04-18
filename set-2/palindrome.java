import java.util.Scanner;
class checker{
    // int result;
     int sum = 0;
     int p;
     int k;
     
     void check(int n)
     {
         int temp = n;
        while (n > 0)
        {
           k = n%10;
           sum = (sum*10)+k;
           n=n/10;
        }
        if(temp == sum)
        {
            System.out.println("palindrome");
        
        }
        else
        {
            System.out.println("not a palindrome");
            
        }
     }

         
 }
public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
       // int result=1;
        checker o = new checker();
        o.check(n);
     }
}
