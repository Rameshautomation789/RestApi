package OOPConceptsPart2;

public class HSBCBank implements USBank,BrazilBank {  // we are achieving multiple inheritence
	
	
	// if a class is implements any Interface, then it is mandatory to define/override all the metods of Interface
	
	public void debit(){
		System.out.println("hsbc ..... debit");
	}
	
	public void credit(){
		System.out.println("hsbc ...... credit");
	}

	public void transfermoney(){
		System.out.println("hsbc ...... transfer money");
	}
	
	public void carloan(){
		System.out.println("hsbc...........car loan");
	}
	
	
	//Brazil Method
	public void mutualfund(){
		System.out.println("hsbc.........mutula fund");
	}
	
}
