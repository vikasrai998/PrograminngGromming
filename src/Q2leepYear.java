import java.util.Scanner;
public class Q2leepYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// this is use for taken user input year is leap year or not
		/*
		 * System.out.println("enter the year : "); int i=sc.nextInt();
		 * 
		 * { if (i%4==0 && i%100!=0 || i%400==0) System.out.println("is leap year");
		 * else System.out.println("not a leap year"); }
		 */
		
		// this is for print leap year between 2000 to 2500 
		for(int i=2000; i<=2500; i++)
		{
			if(i%4==0 && i%100!=0 || i%400==0)
				System.out.println(i);
		}
			
		
		
	}

}
