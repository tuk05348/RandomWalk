/*
 * Random Walker
 * Niaz Baharudeen
 * 08/28/2024
 * This program simulates a random walker, where a person represented by a point, can take one step
 * in any of the four directions, each with equal probability. The number of steps taken is input from
 * the user via the command line. At the end, the squared distance from the origin is printed to the screen
 */

public class RandomWalker {
	
	private int steps; //number of steps to take
	private Point point; //point object to track walker's position
	
	public RandomWalker(int steps) { //constructor, initialized with number of steps and a new point at the origin
		this.steps = steps;
		this.point = new Point();
	}

	public static void main(String[] args) {
		if(args.length != 1) { //throw exception when exactly 1 arg is not given
			throw new IllegalArgumentException("Must have exactly one parameter.");
		}
		int steps = Integer.parseInt(args[0]); //store the number of steps from the command line
		RandomWalker walker = new RandomWalker(steps); //create a new walker object initialized with steps
		int dist = walker.walk(); //complete a random walk and store the squared distance
		System.out.println("squared distance = " + dist); //print the distance to the screen
	}
	
	public int walk() { //simulate walking by stepping the given number of steps
		for(int i=0; i<this.steps; i++) { //take one step each iteration
			this.step();
			//System.out.println(this.point.toString());
		}
		return this.point.getSquaredDistance(); //return the squared distance of the final position of the point
	}
	
	public void step() { //take one step with an equal chance of it being in any of the four cardinal directions
		int step = (int) (Math.random() * 4) + 1; //generate a random number between 1-4 inclusive
		if(step == 1) { //if 1 take one step east
			this.point.moveByX(1);
		}
		else if(step == 2) { //if 2 take one step west
			this.point.moveByX(-1);
		}
		else if(step == 3) { //if 3 take one step north
			this.point.moveByY(1);
		}
		else { //if 4 (only possible outcome left) take one step south
			this.point.moveByY(-1);
		}
	}
	
	public void resetDistance() { //reset the distance the walker walked by clearing the point's position
		this.point.clear();
	}

}
