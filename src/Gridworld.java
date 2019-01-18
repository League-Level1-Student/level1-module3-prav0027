import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;



public class Gridworld {
public static void main(String[] args) {
	World world = new World();
	world.show();
	Random rand = new Random();
	int row = rand.nextInt(10);
	int column = rand.nextInt(10);
	
	Bug bug1 = new Bug();
	Location bug1location = new Location(4,4);
	Bug bug2 = new Bug();
	Location bug2location = new Location(row, column);
	Flower flowerfirst = new Flower();
	Location flowerfirstlocation = new Location(row, column+1);
	Location flowersecondlocation = new Location(row, column-1);
	
	
	world.add(bug1location, bug1);
	world.add(bug2location, bug2);
	bug2.setColor(Color.blue);
	bug2.turn();
	bug2.turn();
	world.add(flowerfirstlocation, flowerfirst);
	world.add(flowersecondlocation, flowerfirst);
	for(int ri=0; ri<10; ri++) {
		for(int ci=0; ci<10; ci++) {
			if(ri!=row&&ci!=4||ri!=4&&ci!=column) {
				Location flowerlocation = new Location(ri, ci);
				world.add(flowerlocation, flowerfirst);
			}
		}
	}
}
}
