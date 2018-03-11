package OOPConceptPart2;

public class HSBCBank implements USBank, BrazilBank { // wea re achieving mutiple inheritance 
	// Is - a relationship
	
	// If a class is implementing any Interface, then it is mandatory to define/override all the methods of Interface. 
	// overriding from USBank
	public void credit() {
		
		System.out.println("HSBC -- Credit");
	}
	
	public void debit() {
		System.out.println("HSBC -- Debit");	
	}
	
	public void transferMoney() {
		System.out.println("HSBC --- transferMoney");
	}
	// Separate methods of HSBCBank Class 
	public void educationLoan() {
		System.out.println("HSBC -- education loan");
	}
	
	public void carLoan() {
		System.out.println("HSBC - car loan");
	}
	
	// Brazil Bank method: overriding from BrazilBank
	
		public void mutualFund() {
			System.out.println("HSBC --- mutualFund");
		}
	

}
