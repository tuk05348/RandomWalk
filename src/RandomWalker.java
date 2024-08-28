
public class RandomWalker {
	
	private int steps;
	
	public RandomWalker(int steps) {
		this.steps = steps;
	}

	public static void main(String[] args) {
		if(args.length != 1) { //throw exception when exactly 1 arg is not given
			throw new IllegalArgumentException("Must have exactly one parameter.");
		}
		int steps = Integer.parseInt(args[0]);

	}
	
	public void walk() {
		
	}
	
	

}
