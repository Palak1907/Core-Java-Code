package javadatatypes;

import java.util.Scanner;

public class TemperatureFtoC {

	public static void main(String[] args) {
		
		System.out.println("Enter the Temperate value to convert Farenheit to Celsius");
		
		Scanner sc = new Scanner(System.in);
		float f = sc.nextFloat();
		float celsius;
		
		celsius=(f-32)*5/9;
		System.out.println("Farenheit to Celsius " +f +" = " +celsius);
		
		sc.close();
	}

}
