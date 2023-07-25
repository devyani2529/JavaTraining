
public class AbstractTest {
	public static void main(String[] args) {
		
				
		GeometricalShape geoShape = new Square(40);
		
		geoShape.calcArea();
		geoShape.calcPerimeter();
		
		System.out.println("-------------");
		
		geoShape = new Rectangle(50,60);
		geoShape.calcArea();
		geoShape.calcPerimeter();
	}
}


abstract class GeometricalShape
{
	abstract void calcArea(); 
	
	protected abstract void calcPerimeter();

	void fillColor() { 
		System.out.println("Filling color...");
	}
}

class Square extends GeometricalShape 
{
	private int side;
	
	public Square(int side) {
		super();
		this.side = side;
	}
	
	void calcArea() {
		float area = side * side;
		System.out.println("Square area : "+area);
	}
	protected void calcPerimeter() { 
		float perimeter = 4 * side;
		System.out.println("Perimeter of Square : "+perimeter);
	}

	public int getSide() {
		return side;
	}
	
}

class Rectangle extends Square 
{
	int breadth;

	public Rectangle(int side, int breadth) {
		super(side);
		this.breadth = breadth;
	}
	
	void calcArea() {
		float area = getSide() * breadth;
		System.out.println("Rectangle area : "+area);
	}
	protected void calcPerimeter() { 
		float perimeter = 2*(getSide() + breadth);
		System.out.println("Perimeter of Rectangle : "+perimeter);
	}
}	