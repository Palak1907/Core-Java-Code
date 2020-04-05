package array;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the length of an array");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		int a[] = new int[len];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i <len; i++) {
			a[i]=sc.nextInt();
			if(a[i]%2==0)
			{
				System.out.println("Number is Even " +a[i]);
			}
			else 
			{
				System.out.println("Number is Odd " +a[i]);
			}
		}
		System.out.println("----------------------------------------------------------");
		//Without User Input
		int b[] = {1,3,5,6,8};

		for(int i=0; i < b.length; i++)
		{
			if(b[i]%2==0)
			{
				System.out.println("Number is Even " +b[i]);
			}
			else 
			{
				System.out.println("Number is Odd " +b[i]);
			}
		}
		sc.close();
	}

}
