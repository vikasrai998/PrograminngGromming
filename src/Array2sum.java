import java.util.Arrays;
import java.util.Scanner;
public class Array2sum {

//	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int sum=0;
		int sum1=0;
		int total=0;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of 1 Array :");
		int size =sc.nextInt();
		System.out.print("enter the 1 array element :");
		
		int a[] =new int[size];
		for(int i=0; i<size; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
	
	
	System.out.println("enter the size of 2 Array :");
	int size2 =sc.nextInt();
	System.out.print("enter the 2 array element :");
	
	int b[] =new int[size2];
	for(int i=0; i<size2; i++) {
		b[i]=sc.nextInt();
	}
	System.out.println(Arrays.toString(b));

	for (int i=0; i<a.length; i++) {
		sum=sum+a[i];
	}
	for (int i=0; i<b.length; i++) {
		sum1=sum1+b[i];
	}
	
	total=sum+sum1;
	
	System.out.println(total);

	}
}
