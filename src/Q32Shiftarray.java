import java.util.Arrays;
import java.util.Scanner;
public class Q32Shiftarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int sum[]=new int[2*n];
		int j=0, k=0;
		System.out.println("Enter 1st array Elements :");
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Enter 2nd array Elements :");
		for(int i=0; i<n; i++) {
			b[i]=sc.nextInt();
		}
		System.out.println("Enter the index");
		int s=sc.nextInt();
		for(int i=0; i<2*n; i++) {
			if(i<s) {
				sum[i]=a[i];
				j++;
			}
			else if(k<b.length) {
				sum[i]=b[k];
				k++;
			}
			else {
				sum[i]=b[j];
				j++;
			}
		}
	}
		System.out.println(Arrays.toString(sum);
			}
	}