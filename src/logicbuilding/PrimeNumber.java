package logicbuilding;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check Prime Number or not");
		int number = sc.nextInt();
		
		for (int i = 1; i <=number; i++) {
			
			if(number%i==0)
			{
				count++;
			}
		
		}	
		
		if(count == 2)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not Prime");
		}
		
		sc.close();

	}

}
