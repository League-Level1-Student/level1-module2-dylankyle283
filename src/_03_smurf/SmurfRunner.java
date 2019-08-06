package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf Handy = new Smurf("Handy");
	Smurf Smurfette = new Smurf("Smurfette");
	Smurf Papa = new Smurf("Papa");
	Handy.eat();
	System.out.println(Handy.getName().toString());
	System.out.println(Smurfette.getName().toString());
	Smurfette.setGirl();
	System.out.println(Smurfette.isGirlOrBoy().toString());
System.out.println(Smurfette.getHatColor().toString());
Papa.setBoy();
System.out.println(Papa.getName().toString());
System.out.println(Papa.getHatColor().toString());
System.out.println(Papa.isGirlOrBoy().toString());

}
}
