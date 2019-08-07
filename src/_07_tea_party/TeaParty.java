package _07_tea_party;

public class TeaParty {
	  private String name;
	private String greeting;
	   private boolean isWoman;
	  private boolean isKnighted;
	
	
	  String getName(){
			return name;
		}
	  String getGreeting(){
			return greeting;
		}
	void setName(String name){
		this.name = name;
	}
	
	boolean getIsWoman(){
		return isWoman;
	}
	void setWoman(){
	isWoman = true;
		
	}
	void setMan() {
		isWoman = false;
	}
	void setKnighted(){
		isKnighted = true;
			
		}
		void setNotKnighted() {
			isKnighted = false;
		}
	public  String welcome(String name, boolean isWoman, boolean isKnighted)
       {
return "Hello" ;
       }




void setGreeting(String name){
	if (isWoman == false && isKnighted == false) {
		greeting.equals("Hello Mr. " + name);
	}
	if (isWoman == true && isKnighted == false) {
		greeting.equals("Hello Ms. " + name);
	}
	if (isWoman == false && isKnighted == true) {
		greeting.equals("Hello Sir. " + name);
	}

	if (isWoman == true && isKnighted == true) {
		greeting.equals("Hello Lady. " + name);
	}

}
}