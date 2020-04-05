package logicbuilding;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int remainder,temp;
		int sum =0;
		System.out.println("Enter a number to check Armstrong Number");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		temp=number;
		while(number>0)
		{
			remainder = number%10;
			sum = sum + remainder*remainder*remainder;
			number = number/10;
		}
		number = temp;
		if(number == sum)
		{
			System.out.println("Number is Armstrong");
		}
		else 
		{
			System.out.println("Number is not Armstrong");
		}
		sc.close();
	}

}
