import java.util.Scanner;
public class Q11Neon 
{
	static boolean isNeon(int n)
	{
		int sum=0, temp=n;
		int sq=n*n;
		do {
			int r=sq%10;
			sum=sum+r;
			sq=sq/10;
		}
		while(sq!=0);
		return sum==temp;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value : ");
		int n=sc.nextInt();
		boolean rs=isNeon(n);
		if(rs)
			System.out.println("neon number");
		else
			System.out.println("not neon number");
	}
}