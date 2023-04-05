import java.util.Scanner;
public class Q12findGcd 
{
	static int findGcd(int m, int n)
	{
		if(n==0)
			return m;
		return findGcd(n,m%n);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st value : ");
		int m=sc.nextInt();
		System.out.println("enter 2nd value : ");
		int n=sc.nextInt();
		int a=findGcd(m,n);
		System.out.println("gcd is : "+a);
		

	}

}
