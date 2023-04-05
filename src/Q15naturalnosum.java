import java.util.Scanner;
public class Q15naturalnosum 
{
	static int sum(int n)
	{
		if(n==0)
			return 0;
		return n+sum(n-1);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range : ");
		int n=sc.nextInt();
		int a=sum(n);
		System.out.println("sum is : "+a);

	}

}
