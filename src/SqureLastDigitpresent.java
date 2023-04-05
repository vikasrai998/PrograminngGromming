import java.util.Scanner;
public class SqureLastDigitpresent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sq=n*n, temp=sq;
		while (n>0&&sq>0){
			int x=n%10;
			int y=sq%10;
			if(x!=y)
				break;
			n=n/10;
			sq=sq/10;
		}
		if(n==0)
			System.out.println(temp);
		else
			System.out.println("not present");
	}

}
