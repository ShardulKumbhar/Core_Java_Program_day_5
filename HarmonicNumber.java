import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
        //userinput
        System.out.println("Please enter the n'th no: ");
        int n = scanner.nextInt();
        int s=0;
        double h=0;
        double c =0;
		for(double a= 1; a<= n; a++)
		{
			c=(1/a);
			h=(h + c);
		}
		System.out.println("Nth Harmonic Value is :"+ h);
	}
}
