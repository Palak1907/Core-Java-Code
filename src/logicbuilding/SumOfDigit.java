package logicbuilding;
import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		
		int sum=0, remainder;
		int number = 25;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value for sum of the digit");
		number = sc.nextInt();
		sc.close();
		while(number>0)
		{
			remainder = number % 10;
			sum = sum + remainder; 	
			number = number /10; 
		}
		
		System.out.println("Sum of given digit number is = " +sum );

	}

}
