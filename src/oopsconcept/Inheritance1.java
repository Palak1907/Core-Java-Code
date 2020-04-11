package oopsconcept;
/*Modify Exercise 1 so that A and B have constructors with arguments instead of default constructors. 
Write a constructor for C and perform all initialization within C’s constructor.
*/
class One{
	public One(int a) {
		System.out.println("Class one constructor has invoked"+a);
	}
}

class Two{
	public Two(int b) {
		System.out.println("Class Two constructor has invoked "+b);
	}
	
}

class Three extends One{

	public Three(int a) {
		super(a);
		
	}
	
}

public class Inheritance1 {

	public static void main(String[] args) {
		Three obj = new Three(12);

	}

}
