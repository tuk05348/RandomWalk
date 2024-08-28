
public class RandomWalker {
	
	private int steps;
	private Point point;
	
	public RandomWalker(int steps) {
		this.steps = steps;
		this.point = new Point(0, 0);
	}

	public static void main(String[] args) {
		if(args.length != 1) { //throw exception when exactly 1 arg is not given
			throw new IllegalArgumentException("Must have exactly one parameter.");
		}
		int steps = Integer.parseInt(args[0]);
		RandomWalker walker = new RandomWalker(steps);
	}
	
	public void walk() {
		
	}
	
	

}
