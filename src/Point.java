/*
 * Point
 * Niaz Baharudeen
 * 08/28/2024
 * Point object consisting of an x,y coordinate for the purpose of tracking the position of a Random Walker
 */

public class Point {
	private int x; //private x, y variables
	private int y;
	
	public Point() { //Constructor creates a new point set at the origin (0, 0)
		this.x = 0;
		this.y = 0;
	}
	
	//change x and y coordinate by a value, simulating movement/taking a step in a direction
	public void moveByX(int xDelta) {
		this.x += xDelta;
	}
	
	public void moveByY(int yDelta) {
		this.y += yDelta;
	}
	//getters
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	//reset the point to the origin
	public void clear() {
		this.x = 0;
		this.y = 0;
	}
	//calculate squared distance
	public int getSquaredDistance() {
		return (this.x * this.x) + (this.y * this.y);
	}
	//prints the current position of the point in the (x, y) coordinate format
	public String toString() {
		return "(" + this.getX() + ", " + this.getY() + ")";
	}
}
