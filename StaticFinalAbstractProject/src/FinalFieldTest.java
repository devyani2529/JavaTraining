
public class FinalFieldTest {

	public static void main(String[] args) {
		final float PI=3.14f;
		Circle cir1=new Circle(44.11f);
		Circle cir2=new Circle(24.15f);
		Circle cir3=new Circle(27.14f);
		Circle cir4=new Circle(25.18f);
		
		cir1.calcArea();
		cir2.calcArea();
		cir3.calcArea();
		cir4.calcArea();
		
		Car car1=new Car("blue", "MH-15-2529");
		Car car2=new Car("black", "MH-14-2459");
		Car car3=new Car("yellow", "MH-12-2429");
		
		car1.showCar();
		car2.showCar();
		car3.showCar();
	}

}
class Car
{
	private String color;
	private final String numberPlate;
	
	Car(String c, String np) {
		color = c;
		numberPlate = np;
	}
	void setCar(String c, String np) {
		color = c;
		//numberPlate = np;
	}
	void showCar() {
		System.out.println("Car : "+color);
		System.out.println("NP  : "+numberPlate);	
	}
}
class Circle{
	private float radius;
	private static float PI=3.14f;

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	void calcArea() {
		float area=PI*radius*radius;
		System.out.println("area :"+area);
	}
}