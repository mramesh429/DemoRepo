package OPPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(10.2);
		obj.sum(10, 20);
		

	}
	
	public static void main(int p) {
		
	}
	
	public static void main(int q,int r) {
		
	}
	//we can overload main method also.
	
	// you can not create a method inside a method
	// duplicate methods  -- i.e.  same method name with same number of arguments are not allowed.
	
	// method overloading --- when the method name is same with different arguments or input parameters with in the same class.
	
	public void sum() { // 0 input parameter
		System.out.println("Sum method -- zero parameter");
		
	}
	
	public void sum(Double i) {// 1 input parameter
		System.out.println("Sum method -- one input parameter");
		System.out.println(i+10);
		
	}
	
	public void sum(int i) {// 1 input parameter
		System.out.println("Sum method -- one input parameter");
		System.out.println(i);
		
	}
	
	public void sum(int k, int l) {// 2 input parameter
		System.out.println("sum method -- two input parameter");
		System.out.println(k+l);
	}

}
