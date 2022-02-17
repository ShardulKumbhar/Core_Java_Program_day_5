import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// user input
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter number:");
		int number = myobj.nextInt();

		if (number % 2 == 0)

			// output
			System.out.println("Entered number is even");
		else
			System.out.println("Entered number is odd");

	}

}
