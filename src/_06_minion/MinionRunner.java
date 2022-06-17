package _06_minion;

public class MinionRunner {
public static void main(String[] args) {
	Minion stuart = new Minion("Stuart", 1, "yellow", "");
	Minion dave = new Minion("Dave", 2, "yellow", "");
	
	
	dave.setName("Dave");
	dave.setEyes(2);
	dave.setColor("yellow");
	dave.setMaster("");
	stuart.setName("Stuart");
	stuart.setEyes(1);
	stuart.setColor("yellow");
	stuart.setMaster("");
System.out.println(stuart.getName().toString());
}
}
