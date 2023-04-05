import java.util.Scanner;
public class Q5Countevenorodd {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digits :");
		int n=sc.nextInt();
		int evencount=0, oddcount=0;
		do {
			int r=n%10;
			n=n/10;
			if(r%2==0)
				evencount++;
			else
				oddcount++;
	}
		while(n!=0);
		System.out.println("even count :"+ evencount);
		System.out.println("odd count :"+ oddcount);

	}

}
