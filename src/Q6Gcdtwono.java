import java.util.Scanner;
public class Q6Gcdtwono {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st value : ");
		int x=sc.nextInt();
		System.out.println("Enter the 2st value : ");
		int y=sc.nextInt();
		int gcd=1;
		for (int i=1; i<=x && i<=y; i++)
		{
			if(x%i==0 && y%i==0)
				gcd=i;
		}
		System.out.println(gcd);
	}

}
