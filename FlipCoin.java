import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) 
	{
		//const;
		int head = 0;
		int tail = 1;
		double count1=0;
		double count2=0;
		double perHeads = 0;
		double perTails = 0;
		
		//user input;
		Scanner scanner =new Scanner(System.in);
        System.out.println("Enter no of times coin tossed:");
     	double n =scanner.nextInt();
     	
     	//logic part;
     	for(int i = 1; i<= n; i++)
     	{
     		int toss = (int) Math.floor((Math.random() * 10) % 2);

     		if (head == toss)
     		{
     			System.out.println("ISts head");
     			count1=count1+1;
     		}
     		else
     		{
     			System.out.println("Its tails");
     			count2=count2+1;
     		}
     	}
     	perHeads = (count1/n);
     	perTails = (count2/n);
     	System.out.println("Percentage of Heads = " + perHeads);
     	System.out.println("Percentage of Tails = " + perTails);
     	if(perHeads > perTails)
     	{
     		System.out.println("Heads");
     	}
     	else
     	{
     		System.out.println("Tails");
     	}
		
		
	}
		
}
