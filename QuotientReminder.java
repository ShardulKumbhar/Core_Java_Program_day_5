import java.util.Scanner;

public class QuotientReminder {

	public static void main(String[] args) {
		// user input value
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a = sc.nextInt();
		System.out.println("Enter the first number:");
		int b = sc.nextInt();

		// logic
		int quotient = a / b;
		int remainder = a % b;

		// output
		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);
	}
}
