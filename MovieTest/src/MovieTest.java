
public class MovieTest {
	public static void main(String args[]) {
		Movie movie1=new Movie(11,"happy new year","Das","srk","deepika",150.5f);
		//movie1.SetMovie(11,"happy new year","Das","srk","deepika",150.5f);
		
		Movie movie2 =new Movie(15,"krish","sas","rutvik","priyanka",200.5f);
		
		movie1.sayHello();
		movie1.printMovie();
		movie2.printMovie();
		
		movie1.changeMovieTicket(4);
		movie1.printMovie();
		
		float totalCost=movie2.buyMovieTicket(4);
		System.out.println("Total Cost : "+totalCost);
		
		
		
	}	
	
}	
	class Movie {
		private int movieTicket;
		private String movieName;
		private String directorName;
		private String actorName;
		private String actoressName;
		private float movieTicketPrice;
		
		 Movie(int movieTicket, String movieName, String directorName, String actorName, String actoressName,
				float movieTicketPrice)
		{
			this.movieTicket = movieTicket;
			this.movieName = movieName;
			this.directorName = directorName;
			this.actorName = actorName;
			this.actoressName = actoressName;
			this.movieTicketPrice = movieTicketPrice;
		}
		 
		 public void sayHello() {
			 System.out.println("Going to see movie");
		 }
		 
		 public void changeMovieTicket(int newTicket) {
			 System.out.println("changing Movie ticket....");
			 movieTicket=newTicket;
		 }
		 float buyMovieTicket (int quantity){
			 System.out.println("Buying.. " +quantity+ " Movie Ticket of " +movieName);
			 return movieTicketPrice*quantity;
			 
		 }
		
		 float getPrice() {
			 System.out.println("returning price of the movie");
			 return getPrice();
		 }

		 
	public void printMovie() {
		System.out.println("Number : "+movieTicket);
		System.out.println("movieName : "+movieName);
		System.out.println("directorName : "+directorName);
		System.out.println("actorName : "+actorName);
		System.out.println("actoressName : "+actoressName);
		System.out.println("movieTicketPrice : "+movieTicketPrice +"\n");
	
	}
	
	}



