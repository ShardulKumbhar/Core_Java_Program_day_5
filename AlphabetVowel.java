import java.util.Scanner;

public class AlphabetVowel {

	public static void main(String[] args) {

		// user input
		char c;
		Scanner scanner;
		scanner = new Scanner(System.in);

		System.out.println("Enter an Alphabet");
		c = scanner.next().charAt(0);

		// logic
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':

			// output
			System.out.println(c + " is vowel");
			break;
		default:
			System.out.println(c + " is consonant");
		}

	}

}
