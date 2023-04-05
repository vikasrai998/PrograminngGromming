import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number :");
		int n=sc.nextInt();
		
		// with out using modules operator %
		if(n/2*2==n) 
			  System.out.println(n+" is the even no"); 
		  else
			  System.out.println(n+" is the odd no");
		 
		
		/*
		 * if(n%2==0) System.out.println(n+ " is even no"); else
		 * System.out.println(n+" is odd no");
		 */
	}

}
