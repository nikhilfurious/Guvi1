import java.util.Scanner;
public class Main{ 

	void check(int a, int d,int n) 
	{ 
		int sum = 0; 
		for (int i = 0; i < n; i++) 
		{ 
			sum = sum + a; 
			a = a + d; 
		} 
		System.out.println(sum);
	    
	} 

	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int d = sc.nextInt(); 
	   check(a, d, n); 
	} 
} 


