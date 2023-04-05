import java.util.Arrays;
import java.util.Scanner;
public class Q31SumArrayindex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements : ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int sum[]=new int[n/2+1];
		int j=0;
		System.out.println("Enter 1st array element :");
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter 2nt array element :");
		for(int i=0; i<n; i++) {
			b[i]=sc.nextInt();
		}
		for(int i=0;i<n; i++) {
			if(i%2==0) {
				sum[j]=a[i]+b[i];
				j++;}
		}
		System.out.println(Arrays.toString(sum));
	}
}
