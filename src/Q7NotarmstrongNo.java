import java.util.Scanner;
public class Q7NotarmstrongNo {
	static int getCount(int x)
	{
		int count=0;
		do {
			x=x/10;
			count++;
		}
		while(x!=0);
		return count;
	}
	static int Pow(int n,int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
	static boolean isNotArmStrong(int n)
	{
		int sum=0, temp=n;
		int dc=getCount(n);
		do {
			int r=n%10;
			sum=sum+Pow(r,dc);
			n=n/10;
		}
		while(n!=0);
		return sum!=temp;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=1; i<=500; i++)
		{
			boolean rs=isNotArmStrong(i);
			if(rs)
				sum=sum+i;
		}
	System.out.println("sum is : "+sum);
	}

}
