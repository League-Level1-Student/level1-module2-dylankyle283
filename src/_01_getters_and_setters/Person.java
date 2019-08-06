package _01_getters_and_setters;

public class Person {
private String name = "";
private String power = "";



String getName(){
	
	
	return name;
}
String getPower(){
	
	
	return power;
}
void setName(String name){
	this.name = name;
}
void setPower(String power){
	this.power = power;
}
public String toString(){
	
	
	
	return name + " has great " + power + " skills";
}
}