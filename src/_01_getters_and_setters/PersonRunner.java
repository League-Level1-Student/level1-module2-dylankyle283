package _01_getters_and_setters;

public class PersonRunner {
public static void main(String[] args) {
	
	Person Bob = new Person();
	Person Bill = new Person();
Person Dave = new Person();
	Bob.setPower("Strength");
	Bob.setName("Bob");
	System.out.println(Bob.toString().toString());
	
	Bill.setPower("Flight");
	Bill.setName("Bill");
	System.out.println(Bill.toString());
	
Dave.setPower("Speed");
Dave.setName("Dave");
System.out.println(Dave.toString());
}
}
