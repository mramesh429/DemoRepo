package OPPConceptPart1;

public class LocalVsGlobalVariables {
	
	// Global variables --- class variables
	String name = "Tom";
	int age = 25;		

	public static void main(String[] args) {
		
		int i =10;// local var of main method
		System.out.println(i);
		
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(obj.age);
		

	}
	
	public void sum() {
		int i =20; // local var of sum method
		System.out.println(i);
		int j = 30;
		
	}

}
