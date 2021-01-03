package OOPConceptsPart2;

public class TestBank {

	public static void main(String[] args) {

		
		System.out.println(USBank.minbalance);
		
		
		HSBCBank hs=new HSBCBank();
		
		hs.debit();
		hs.credit();
		hs.transfermoney();
		hs.carloan();
		
		
		
		//dynamic polymorphism
		//child class is object can be referred by parent Interface reference variable
		
		USBank us=new HSBCBank();
		us.debit();
		us.credit();
		us.transfermoney();
		
		
		
	}

}
