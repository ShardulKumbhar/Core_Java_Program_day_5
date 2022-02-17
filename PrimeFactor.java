import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		int number;

		// userinput;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ::");
		number = sc.nextInt();

		// logic
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				for (int j = 2; j <= i; j++) {
					if ((i % j) == 0) {
						if (j == i) {
							System.out.println("Prime Factor of " + number + " = " + j);
						} else {
							break;
						}
					}
				}
			}
		}
	}
}
