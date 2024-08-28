
public class RandomWalkers {

	public static void main(String[] args) {
		if(args.length != 2) {
			throw new IllegalArgumentException("Exactly 2 arguments are required");
		}
		
		int nSteps = Integer.parseInt(args[0]);
		double tTrials = Double.parseDouble(args[1]);
		System.out.println(nSteps + " " + tTrials);
		
		double sum = 0;
		RandomWalker walker = new RandomWalker(nSteps);
		for(int i=0; i<tTrials; i++) {
			sum += walker.walk();
			walker.resetDistance();
		}
		double mean = sum/tTrials;
		System.out.println("mean squared distance = " + mean);
	}

}
