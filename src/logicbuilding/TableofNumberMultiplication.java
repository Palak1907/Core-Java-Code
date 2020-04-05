package logicbuilding;

import java.util.Scanner;

public class TableofNumberMultiplication {

	public static void main(String[] args) {
		
		System.out.println("Enter a number to print table");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int res;
		for(int i=1 ; i<=10;i++)
		{
			res = number*i;
			System.out.println(number +" * "+ i +" = " +res );
		}
		sc.close();

	}

}
