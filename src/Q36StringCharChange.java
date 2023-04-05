import java.util.Scanner;
public class Q36StringCharChange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(ch[i]=='a'||ch[i]=='A') {;
				ch[i]='@';
			}
		}
		System.out.println(new String(ch));
		
	}

}
