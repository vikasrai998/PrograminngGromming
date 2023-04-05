import java.util.Scanner;
public class StringReverse {

	
	public static void main(String[] args) {
		String b="";
		System.out.println("Enter the String :");
		Scanner sc=new Scanner(System.in);
		String a= sc.nextLine();
		
		for(int i=a.length()-1; i>=0; i--) {
			 b=b+a.charAt(i);
			
		}
		System.out.println(b);
		
	}
}
