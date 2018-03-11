package OPPConceptPart1;

public class StaticAndNonStaticConcept {
	// global vars :  --  the scope of global vars will be available across all the functions with some conditions
	
	// Global variables --- class variables
		String name = "Tom";// non static global var
		static int age = 25;		// static global var


	public static void main(String[] args) {
		
		// how to call static methods and vars?
		// 1. direct calling:
		sum();
		
		//2. calling by class name:
		StaticAndNonStaticConcept.sum();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		// how to call non static methods and vars?
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
		// Can I access static method by using object reference? Yes
		obj.sum();// warning will be given
		
	
	}

	
	public void sendMail() { //non static method 
		System.out.println("send mail method -- non static");
	}
	
	public static void sum() {// static method
		System.out.println("sum method -- static");
	}
	
	
	
}
