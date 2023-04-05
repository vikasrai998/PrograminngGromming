import java.util.Scanner;
public class Q3SpecialNo {
	static boolean isSpecial(int n)
	{
		int d1=n%10;
		int d2=n/10;
		int sum=d1*d2+d1+d2;
		return sum==n;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		for(int i=10; i<=99; i++)
		{
			boolean rs=isSpecial(i);
			if(rs)
				System.out.println(i+" ");
		}
	}
}
