/*Algorithm to find the smallest and largest number in an array
 1. Input the array element
 2. Initialize small=large=a[0]
 3. repeat from i=1 to n
 4. if(a[i]>large)
 5. large=a[i]
 6. if(a[i]<small)
 7. small=a[i]
 8. print small and large
 */
package array;
import java.util.Scanner;

public class LargestSmallestNumberInArray {

	public static void main(String[] args) {
		
		System.out.println("Enter the length of an array");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		System.out.println("Enter the element of the array");
		int a[] = new int[len];
		for(int i =0;i<len;i++) 
		{
			a[i] = sc.nextInt();
		}
		
		int large,small;
		large=small=a[0];
		for(int j=1;j<len;j++) {
			
			if (a[j]>large) {
				large=a[j];
			}
			if(a[j]<small) {
				small=a[j];
			}
			
		}
		System.out.println("Largest number is "+large);
		System.out.println("Smallest number is "+small);
		sc.close();

	}

}
