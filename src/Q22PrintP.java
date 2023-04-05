import java.util.Scanner;
public class Q22PrintP 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n : ");
		int n=sc.nextInt();
		for (int i=1; i<=n;i++)
		{
			for (int j=1; j<=n/2+1; j++)
			{
				if(i<=n/2+1||(i!=n/4+1&&j!=n/4+1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	

	}

}
