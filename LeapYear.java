import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// user input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year:");
		int year = sc.nextInt();

		// logic part
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))

			// output
			System.out.println("Year is a leap year");
		else
			System.out.println("Year is not a leap year");
	}

}
