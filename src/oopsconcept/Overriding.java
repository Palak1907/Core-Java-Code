package oopsconcept;

class carClass 
{
  
  public void color() //Method Overloading
  {
	  System.out.println("RED");
  }
  
  public void color(String s) {
	  System.out.println(s);
	  }
  
  public int Speed() {
		return 100;
	  }
}

class fordCar extends carClass
{
  public int Speed() //MEthod overriding
  {
	return 150;
  }
  
  
}

public class Overriding {

	public static void main(String[] args) {
		//Method Overriding
		carClass cc1 = new carClass();
		int speed1 = cc1.Speed();
		System.out.println(speed1);
		
		fordCar fc1 = new fordCar();
		int speed2 = fc1.Speed();
		System.out.println(speed2);
		
		carClass cc2 = new fordCar();
		int speed3 = cc2.Speed();
		System.out.println(speed3);
		
		//MEthod Overlading 
		cc1.color();
		cc1.color("Blue");
	}

}
