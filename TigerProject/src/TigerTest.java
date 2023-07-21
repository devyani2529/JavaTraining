
public class TigerTest {

	public static void main(String[] args) {
	Tiger tiger=new Tiger();
	tiger.jump();
	tiger.jump(8);
	tiger.jump(6,8);
	tiger.jump(7,6.5f);
	tiger.jump(5.5f,3.5f);

	}

}

class Tiger
{
	void jump() {
	System.out.println("Tiger: jump(): is jumping...");
	}
	void jump(int length) {
		System.out.println("Tiger: jump(int) is jumping..."+length+" feet length");
	}
	void jump(int length,int height) {
		System.out.println("Tiger: jump(int,int): is jumping..."+length+"feet length and \"+height+\" feet long height");
	}
	void jump(int length,float height) {
		System.out.println("Tiger: jump(int): is jumping..."+length+"feet length and  \"+height+\" feet long height");

	}
	void jump(float length,float height) {
		System.out.println("Tiger: jump(float): is jumping..."+length+"feet length and  \"+height+\" feet long height");

	}
}