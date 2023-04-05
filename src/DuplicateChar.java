import java.util.Scanner;
public class DuplicateChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int a[]=new int[26];
		char ch[]=st.toCharArray();
		for(int i=0; i<ch.length; i++) {
		if(ch[i]>='A'&&ch[i]<='Z')
			a[ch[i]-65]++;
		else if(ch[i]>='a'&&ch[i]<='z')
			a[ch[i]-97]++;
	}
	for(int i=0; i<26; i++) {
		if(a[i]>1)
			System.out.println((char)(i+65)+"=>"+a[i]);
	}
}

}
