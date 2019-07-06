
import java.util.Scanner;
public class Main{ 

	static float sumOfAP(float a, float d,int n) 
	{ 
		float sum = 0; 
		for (int i = 0; i < n; i++) 
		{ 
			sum = sum + a; 
			a = a + d; 
		} 
		return sum; 
	} 

	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float a = sc.nextFloat(),d = sc.nextFloat(); 
		System.out.println(sumOfAP(a, d, n)); 
	} 
} 


