package OPPConceptPart1;

public class FunctionsInJava {

	// main method --- starting point of execution
	public static void main(String[] args) {
		
		 FunctionsInJava obj = new FunctionsInJava();
		 // one object will be created, obj is the reference variable, referring to this object.
		 //after creating the object, the copy of all non static methods will be given to this object
		 // object can not hold the static methods.
		 
		 obj.test();
		int l = obj.pqr();
		System.out.println(l);
		
		String s1 = obj.qa();
		System.out.println(s1);
		
		int div = obj.division(30, 10);

		System.out.println(div);
		 
		// main method is void --- never return a value
		
	}
	
		
   // no -static methods
	
		// void --  does not return any value
	    // return type = void
		public void test() {  // no input, some output
			System.out.println("test method");
		}
		
		// return type --- int
		public int pqr() {
			System.out.println("PQR methos");
		
			int a = 10;
			int b = 20;
			int c =a+b;
			
			return c;
		}
		
		// return type --- String
		public String qa() { // no input, some output
			System.out.println("QA method");
			String s = "Selenium";
			
			return s;
		}
		
		// return type --- int
		// x,y --- input parameters or arguments.
		public int division(int x, int y) {
			System.out.println("Division method");
			int d = x/y;
			
			return d;
			
		}

}
