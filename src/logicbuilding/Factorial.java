package logicbuilding;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
	// WhILE LOOP
		/*int res =1,fact;
		System.out.println("Enter the number to get factorial");
		Scanner sc = new Scanner(System.in);
		fact = sc.nextInt();
		int a = fact;
		while (fact>=1)
		{
			res = fact*res;
			fact--;
		}
		
		System.out.println("Factorial of " +a +" is " +res);
		sc.close();*/
		
		//FOR LOOP
		int fact = 1,number;
		System.out.println("Enter the number to get factorial");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		for(int i=1 ; i<=number; i++)
		{
			 fact = fact*i;
		}
		System.out.println("Factorial of "+number +" is " +fact);
		sc.close();
	}

}
