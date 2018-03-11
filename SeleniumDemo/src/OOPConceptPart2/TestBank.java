package OOPConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		
		// dynamic Polymorphism
		// child class object can be reffered by parent Interface reference var	
		
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
		

	}

}
