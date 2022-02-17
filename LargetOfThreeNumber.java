import java.util.Scanner;

public class LargetOfThreeNumber {

	public static void main(String[] args) {
		// constant
		int a, b, c, largest, temp;

		// user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a = sc.nextInt();
		System.out.println("Enter the second number:");
		b = sc.nextInt();
		System.out.println("Enter the third number:");
		c = sc.nextInt();

		// comparing a and b
		temp = a > b ? a : b;

		// comparing the temp and c
		largest = c > temp ? c : temp;

		System.out.println("The largest number is: " + largest);

	}
}
