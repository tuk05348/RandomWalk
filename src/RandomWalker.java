
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
		int dist = walker.walk();
		System.out.println("squared distance = " + dist);
	}
	
	public int walk() {
		for(int i=0; i<this.steps; i++) {
			this.step();
			System.out.println(this.point.toString());
		}
		return this.point.getSquaredDistance();
	}
	
	public void step() {
		int step = (int) (Math.random() * 4) + 1;
		if(step == 1) {
			this.point.moveByX(1);
		}
		else if(step == 2) {
			this.point.moveByX(-1);
		}
		else if(step == 3) {
			this.point.moveByY(1);
		}
		else {
			this.point.moveByY(-1);
		}
	}

}
