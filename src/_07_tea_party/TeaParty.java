package _07_tea_party;

public class TeaParty {
	 
	private String greeting;
	 
	
	
	
			
		
		
	public  String welcome(String name, boolean isWoman, boolean isKnighted)
       {
//		if (name.equals("Austen")) {
//			isWoman = true ;
//				isKnighted = false;
//		}
//		if (name.equals("Orwell")) {
//			isWoman = false ;
//				isKnighted = false;
//		}
//		if (name.equals("Isaac Newton")) {
//			isWoman = false ;
//				isKnighted = true;
//		}
//		
		
		if (isWoman == false && isKnighted == false) {
			greeting ="Hello Mr. " + name;
		}
		if (isWoman == true && isKnighted == false) {
			greeting = "Hello Ms. " + name;
		}
		if (isWoman == false && isKnighted == true) {
			greeting = "Hello Sir " + name;
		}

		if (isWoman == true && isKnighted == true) {
			greeting = "Hello Lady " + name;
		}
	return greeting;
		
    
       }




	

}