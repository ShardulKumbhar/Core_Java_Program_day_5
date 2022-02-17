import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// userinput1
		Scanner myobj = new Scanner(System.in);
		System.out.println("Enter the first number num1 :");
		int num1 = myobj.nextInt();
		// userinput2
		Scanner myobj1 = new Scanner(System.in);
		System.out.println("Enter the second number num2:");
		int num2 = myobj1.nextInt();

		// logic
		int a = num2;
		int b = num1;

		// output
		System.out.println("After swaping first number is :" + a);
		System.out.println("After swaping Second number is :" + b);
	}

}
