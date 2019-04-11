import java.util.Scanner;
class Main
{
   public static void main(String arg[])
	
   {
	
       long n,p,r=1;
	
       Scanner sc=new Scanner(System.in);
 
      // System.out.println("enter number");
	  
       n=sc.nextLong();
 
      // System.out.println("enter power");
	  
       p=sc.nextLong();
 
           for(int i=1;i<=p;i++)
	       { 
                   r=r *n;
	       }
 
    	  System.out.println(r);
 
    }
 
}
