package _06_minion;

public class Minion {
	private String name; 
		private int eyes; 
		private String color; 
		private String master;


 public Minion(String name, int eyes, String color, String master) {
			// TODO Auto-generated constructor stub
	
 this.name = name;
 this.eyes = eyes;
 this.color = color;
 this.master = master;
 
 
 }


String getName(){
	
	
	
	return name;
}


void setName(String name) {
	this.name = name;
}



  int getEyes() {
	
	return eyes;
}





void setEyes(int eyes) {
	this.eyes = eyes;
}

  String getColor() {

	return color;
}


void setColor(String color) {
	this.color = color;
}






public void setMaster(String master) {
	this.master = master;
	
}


 String getMaster() {
	
	return master;
}






















}
