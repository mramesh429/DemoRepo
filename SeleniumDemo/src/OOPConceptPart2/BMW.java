package OOPConceptPart2;

public class BMW extends Car {
	
	// when same method is present in parent class as well as in child class with the same name number of arguments is called Method Overriding. 
	public void start() { // Overridden method
		System.out.println("BMW -- Start");
	}
	
	public void theftSafety() {
		System.out.println("BMW --- theftSafety");
	}
	
	


}
