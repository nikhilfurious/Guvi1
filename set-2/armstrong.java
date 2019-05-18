import java.lang.*;
import java.util.Scanner;
class arm{
    void check(int n)
    {
		int k=n;
		int temp=0;
		while(n>0){
		    int rem=n%10;
		    n/=10;
		    temp+=Math.pow(rem,3);
		}
		if(temp==k){
		    System.out.print("yes");
		}
		else{
		    System.out.print("no");
		}
	}
}
public class Main{
    public static void main(String args[]){
    arm o = new arm();
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    o.check(a);
}
}
