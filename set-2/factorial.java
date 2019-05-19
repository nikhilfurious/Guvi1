import java.lang.*;
import java.util.Scanner;
class factorial
{
    int fact = 1;
    int i;
    
    void fac(int n)
    {
        for(i=1;i<=n;i++)
        {
            fact=fact * i;
        }
    
    System.out.println(fact);
    }
}

public class Main
{
	public static void main(String[] args) 
	{
	factorial f = new factorial();
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	f.fac(a);
	}
}
