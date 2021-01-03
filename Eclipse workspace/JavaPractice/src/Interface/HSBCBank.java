package Interface;

public class HSBCBank implements USBank {

	@Override
	public void credit() {
		System.out.println("hsbc.... Credit");
	}

	@Override
	public void debit() {
		System.out.println("hsbc......Debit");
	}

	@Override
	public void transferMoney() {
		System.out.println("hsbc........TranferMoney");
	}
	
	
	
	// Separate Methods of HSBC Bank Class
	public void educationloan(){
		System.out.println("hsbc......Educationloan");
	}
	
	public void Carloan(){
		System.out.println("hsbc.......CarLoan");
	}

}
