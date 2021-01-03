package Interface;

public class TestBank {

	public static void main(String[] args) {
		
		
		HSBCBank hs=new HSBCBank();
		
		 hs.credit();
		 hs.debit();
		 hs.transferMoney();
		 hs.educationloan();
		 hs.Carloan();
		 
		 
		 System.out.println("********************************");
		 
		 USBank	b=new HSBCBank();   // Child class object can be refereed by  Parent Interface reference var
		 
		 b.credit();
		 b.debit();
		 b.transferMoney();
		 

	}

}
