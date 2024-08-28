/*
 * RandomWalkers
 * Niaz Baharudeen
 * 08/28/2024
 * Simulates conducting many random walks with a RandomWalker object for a set number of trials
 * Command line takes in 2 integers for input, number of steps, and number of trials
 * Prints the average squared distance of all trials
 * Purpose is to simulate Brownian motion in a discrete way
 */

public class RandomWalkers {

	public static void main(String[] args) {
		if(args.length != 2) { //check the number of arguments
			throw new IllegalArgumentException("Exactly 2 arguments are required");
		}
		
		int nSteps = Integer.parseInt(args[0]); //parse number of steps
		double tTrials = Double.parseDouble(args[1]); //parse number of trials
		System.out.println("Steps: " + nSteps + " Trials: " + tTrials); //print back number of steps and trials
		
		double sum = 0; //initialize running sum
		RandomWalker walker = new RandomWalker(nSteps); //initialize RandomWalker with number of steps
		for(int i=0; i<tTrials; i++) { //for each trial, do a random walk, add to sum, and clear distance walked
			sum += walker.walk();
			walker.resetDistance();
		}
		double mean = sum/tTrials; //calculate mean square distance, print to screen
		System.out.println("mean squared distance = " + mean);
	}

}
