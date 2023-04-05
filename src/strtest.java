import java.util.Scanner;

public class strtest {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the string");
	String st=s.nextLine();
	int c[]=new int[128];
	for(int i=0;i<st.length();i++)
	{
		char ch=st.charAt(i);
		c[ch]++;
		
	}
	for(int i=0;i<c.length;i++)
	{
		if(c[i]>0)
		{
			if(c[i]==2)
				continue;
			System.out.print((char)i);
		}
	}
	
	
}
}
