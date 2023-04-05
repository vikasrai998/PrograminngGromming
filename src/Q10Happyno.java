import java.util.Scanner;
public class Q10Happyno {
	static boolean isHappy(int n)
	{
		while(n>9)
		{
			int sum=0;
			while(n!=0)
			{
				int r=n%10;
				sum=sum+r*r;
				n=n/10;
			}
			n=sum;
		}
		return n==1|| n==7;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=1; i<=200; i++)
		{
			boolean rs=isHappy(i);
			if(rs)
				sum=sum+i;
		}
		System.out.println("sum is: "+sum);
	}
}
