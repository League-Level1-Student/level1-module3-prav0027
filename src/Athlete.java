
public class Athlete {
	static int nextBibNumber;
	static String raceLocation = "New York";
	static String raceStartTime = "9.00 am";

	String name;
	int speed;
	int bibNumber;

	Athlete(String name, int speed, int bibNumber) {
		this.name = name;
		this.speed = speed;
		this.bibNumber = bibNumber;
	}

	public static void main(String[] args) {
		Athlete a1 = new Athlete("joe", 100, 1);
		Athlete a2 = new Athlete("mary", 50, 2);
		if (a1.bibNumber == a2.bibNumber) {
			System.out.println("Two racers cannot have the same bib number. Please try again.");
		} else {
			System.out.println(a1.name);
			System.out.println(a1.bibNumber);
			System.out.println(a1.raceLocation);
			System.out.println(a2.name);
			System.out.println(a2.bibNumber);
			System.out.println(a2.raceLocation);
		}
	}
}
