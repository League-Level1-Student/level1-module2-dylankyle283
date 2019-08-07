package _04_tea_maker;

public class TeaRunner {
public static void main(String[] args) {
	Cup cup = new Cup();
	Kettle kettle = new Kettle();
	TeaBag teabag = new TeaBag("Mint");

kettle.getWater();
kettle.boil();
cup.makeTea(teabag, kettle.getWater());

}
}
