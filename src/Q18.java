import java.util.Scanner;
public class Q18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n=sc.nextInt();
		int x=1;
		for(int i=1; i<=n; i++)
		{
			for (int j=1; j<=n+i-1; j++)
			{
				System.out.print((char)(64+x)+" ");
				x++;
			}
			System.out.println();
		}
	}

}
