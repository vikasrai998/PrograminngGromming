 import java.util.Scanner;
 
	public class StringConversion {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Get input string from user
	        System.out.print("Enter a string: ");
	        String a = scanner.nextLine();

	        // Convert string to uppercase
	        String upperCaseString = a.toUpperCase();
	        System.out.println("Uppercase string: " + upperCaseString);

	        // Convert string to lowercase
	        String lowerCaseString = a.toLowerCase();
	        System.out.println("Lowercase string: " + lowerCaseString);

	        // Convert string to title case
	        String firstChar = a.substring(0, 1).toUpperCase();
	        String AnotherString = firstChar + a.substring(1).toLowerCase();
	        System.out.println("Title case string: " + AnotherString);
	    }
	}
