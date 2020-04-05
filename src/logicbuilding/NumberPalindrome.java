package logicbuilding;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		
		int sum=0;
		int temp ,number,remainder;
		
		System.out.println("Enter a number to check Palindrome or not");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		temp= number;
		
		while(number>0) {
			remainder = number % 10;
			sum = sum * 10 + remainder;
			number = number/10;
		}
		number=temp;
		
		if(number == sum)
		{
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}
		sc.close();
	}

}
