package oopsconcept;


class A{
	public A() 
	{
		System.out.println("Class A constructor");	
	}
}

class B{
	int a =20;
	public B() 
	{
		System.out.println("Class B constructor");
	}
}

class C extends A{
	B b = new B();
	
	}
public class Inheritance {

	public static void main(String[] args) {
		
		C Cobj= new C();
	}

}
