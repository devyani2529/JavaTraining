
public class FinalMethodTest {

	public static void main(String[] args) {
		//Chess chess = new Chess();
		//chess.moveKnight();
				
		//GraphicalChess graphChess = new GraphicalChess();
		//graphChess.moveKnight();
				
		GraphicalChess chess = new GraphicalChess();
				
		Game.upload(chess);

	}

}
class Game { 
	
	static void upload(GraphicalChess chess) {
		System.out.println("Game is being uploaded....");
		chess.moveKnight();
		chess.moveRook();
	}
}

class Chess
{
	
	
	void moveKnight() { 
		System.out.println("Math moving in L shape...2.5 steps");
	}
	void moveRook() {
		System.out.println("Math moving horizonal / vertical bidirectional 1/N steps");
	}
}


class GraphicalChess extends Chess 
{	

	void moveKnight() { 
		super.moveKnight();
		System.out.println( " + Graphical Moving in L shape.in a frame..2.5 steps...");
	}
	void moveRook() {
		System.out.println("Graphically moving rook ANY direction 1/N steps");
	}
}


class WebGraphicalChess extends Chess 
{
	void moveKnight() { 
		super.moveKnight();
		System.out.println("+ Graphical Moving in L shape.in a web page..2.5 steps...");
	}
}