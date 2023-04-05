import java.util.Scanner;
public class Diseriumnumberprogram {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();
	        sc.close();
	        int sum = 0, count = 0, temp = num;
	        while (temp > 0) {
	            count++;
	            temp /= 10;
	        }
	        temp = num;
	        while (temp > 0) {
	            int digit = temp % 10;
	            sum += Math.pow(digit, count);
	            count--;
	            temp /= 10;
	        }
	        if (sum == num) {
	            System.out.println(num + " is a Disarium number.");
	        } else {
	            System.out.println(num + " is not a Disarium number.");
	        }
	    }
}
