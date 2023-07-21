
public class Point {
  public static void main(String args[]) {
	  Point1 p=new Point1(100,200);
	  p.showPoint();
	  
	  Point2 p1=new Point2(50,10, 0);
	  p1.showPoint();
	  
	  Point3 p2=new Point3(1,55, 0);
	  p2.showPoint();
  
}
}
class Point1{
	private int x;
	private int y;
	
	Point1(int x,int y){
		this.x=x;
		this.x=y;
	}
	void showPoint() {
		System.out.println("x =" +x);
		System.out.println("y =" +y);
	}
}
class Point2 extends Point1{
	private int z;
	
	Point2(int x,int y,int z){
		super(x,y);
		this.z=z;
	}
	void showpoint() {
		super.showPoint();
		System.out.println("z"+z);
		
	}
}	
class Point3 extends Point2{
	private int a;
	
	Point3(int x,int y,int z){
		super(x,y,z);
		this.a=a;
	}
	void showpoint() {
		super.showPoint();
		System.out.println("a"+a);
		
	}
}	



