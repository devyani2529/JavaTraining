
public class OverRidingTest {

	public static void main(String[] args) {
		Father  f= new Father();
		f.farming();
	}

}
class GrandFather{
	void  farming() {
		System.out.println("GrandFather : farming is traditional");
	}

}
class Father extends GrandFather{
	void  farming() {
		System.out.println("Father : farming is super");
	}

}
class Child extends Father{
	void  farming() {
		System.out.println("Child : child farming is morden");
	}

	
}