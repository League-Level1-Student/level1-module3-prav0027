import javax.swing.JOptionPane;

public class Netflix {
	static Movie  superman = new Movie("Superman", 4 );
	static Movie infinitywar = new Movie("Infinity War", 5);
	static Movie thor = new Movie("Thor: Ragnarok", 3);
	static Movie ant = new Movie("Ant-Man and the Wasp", 1);
	static Movie ironman = new Movie("Iron Man", 3);
	static NetflixQueue avengers = new NetflixQueue();
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, superman.getTicketPrice());
	avengers.addMovie(superman);
	avengers.addMovie(infinitywar);
	avengers.addMovie(thor);
	avengers.addMovie(ant);
	avengers.addMovie(ironman);
	avengers.printMovies();
	JOptionPane.showMessageDialog(null, "The best movie is "+avengers.getBestMovie());
	JOptionPane.showMessageDialog(null, "The second best movie is "+avengers.getSecondBestMovie());
}
}
