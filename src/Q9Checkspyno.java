import java.util.Scanner;
public class Q9Checkspyno {
	static boolean isSpy(int n)
	{
		int sum=0,prod=1;
		do {
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		while(n!=0);
		return sum== prod;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value: ");
		int n=sc.nextInt();
		boolean rs=isSpy(n);
		if(rs)
			System.out.println("Spy number");
		else 
			System.out.println("not Spy number");
	}
}
