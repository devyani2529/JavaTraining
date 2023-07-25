
public class KiteTest {
	public static void main(String args[]) {
		Kite.showKiteCount();
		
		Kite kite1=new Kite("Deepali","red",50);
		kite1.showKite();
		
		Kite kite2=new Kite("Dev","blue",60);
		kite2.showKite();
		
		Kite kite3=new Kite("Deepa","yellow",30);
		kite3.showKite();
		Kite.showKiteCount();
		
		Kite kite4=new Kite("sonali","white",40);
		kite4.showKite();
		
		Kite kite5=new Kite("Swarali","Black",10);
		kite5.showKite();
		
		kite5.kiteFight(kite4);
	}
	
	
}
class Kite{
	private String owner;
	private String color;
	private int length;
	private boolean flying;
	
	private static int kiteCount;
	public static void showKiteCount() {
		System.out.println("Total kites in sky :"+kiteCount);
	}

	public Kite(String owner, String color, int length) {
		super();
		this.owner = owner;
		this.color = color;
		this.length = length;
		this.flying = flying;
	}
	 void showKite() {
		System.out.println("Kite ownner :"+owner);
		System.out.println("Kite color :"+color);
		System.out.println("Kite lenth :"+length);
		System.out.println("Kite Count :"+Kite.kiteCount);
		System.out.println("__________");
		
	}
	 
	 void kiteFight(Kite ref) {
		 System.out.println("Kite fight initiated  "+ref.color +"");
		 for(int i=1;i<=20;i++) {
			 double value=Math.random()%10;
			 System.out.println("Kites are fighting");
			 if(value >=0.85) {
				 kiteCount--;
				 this.flying=false;
			 }
			 if(value <0.10) {
				 kiteCount--;
				 ref.flying=false;
			 }
			 if(value>=0.30 && value<=0.50) {
				 kiteCount-=2;
				 this.flying=false;
				 ref.flying=false;				 
			 }
		 }
	 }

	@Override
	public String toString() {
		return "Kite [owner=" + owner + ", color=" + color + ", length=" + length + "]";
	}

	
	

	
}