import java.util.Scanner;
public class Q4SumofEachdigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the digits : ");
		int n=sc.nextInt();
		int sum=0;
		do {
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		while(n!=0);
		System.out.println("sum of digits: "+sum);
		
		
	}

}
