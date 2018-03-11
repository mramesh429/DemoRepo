package OOPConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		// static polymorphism --- compile-time polymorphism 
		BMW b = new BMW();
		b.start();
		b.stop();
		b.reful();
		b.theftSafety();
		b.engine();
		
		System.out.println("****************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.reful();
		
		System.out.println("$$$$$$$$$$$$$");
		
		// Top casting
		Car c1 = new BMW(); // child class object can be referred by parent class reference variable -- dynamic polymorphism -- Run-time polymorphism
		
		c1.start();
		c1.stop();
		c1.reful();
		
		// Down Casting
		//BMW b1 = new Car(); // not allowing
		
		BMW b1 = (BMW)new Car(); // ClassCastException
		
		


	}

}
