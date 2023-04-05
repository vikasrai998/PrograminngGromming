import java.util.Scanner;
public class Q14printnto1 
{
	static void printNumbers(int n)
	{
		if(n==0)
			return;
		System.out.println(n+" ");
		printNumbers(n-1);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range : ");
		int n=sc.nextInt();
		printNumbers(n);

	}

}
