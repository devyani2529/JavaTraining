
public class HasATest {

	public static void main(String[] args) {
		Human human=new Human();
		human. breathing();
		human.thinking();
		human.drinkLemonJuice();
		human.doPranayama();
		
	}

}
class Heart
{
	void pumping() {
		System.out.println("Heart is pumping...");
		
	}
}
class Brain{
	void anyalzing() {
		System.out.println("Brain is anyalzing..");
	}
}
class Mammel{
	
}
class Kidney{
	void filterBlood(){
		System.out.println("Filtering the blood..");
	}
	
}
class lung{
	void purifyblood() {
		System.out.println("Purifying the human blood...");
	}
}
class Human extends Mammel{
	private Heart  myHeart=new Heart();
	private Brain brain=new Brain();
	private Kidney kidney =new Kidney();
	private Kidney rightKidney=new Kidney();
	private Kidney leftKidney=new Kidney();
	private lung rightlung=new lung();
	private lung leftlung=new lung();
	void breathing() {
		System.out.println("Human is Breathing..");
		myHeart.pumping();
	}
	void thinking() {
		System.out.println("Human is thinking..");
		brain.anyalzing();	
	}
	void drinkLemonJuice() {
		System.out.println("Drinking Lemon juice..");
		rightKidney.filterBlood();
		leftKidney.filterBlood();
	}
	void doPranayama() {
		System.out.println("Doing pranayam..");
		rightlung.purifyblood();
		
		
	}
}