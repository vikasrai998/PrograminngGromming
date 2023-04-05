import java.util.Scanner;
public class Q13 
{
	static int fact(int n)
	{
		if(n==0||n==1)
			return 1;
			return n*fact(n-1);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value : ");
		int n=sc.nextInt();
		int a=fact(n);
		System.out.println("fact is : "+a);
	}

}
