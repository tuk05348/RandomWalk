
public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void moveByX(int xDelta) {
		this.x += xDelta;
	}
	
	public void moveByY(int yDelta) {
		this.y += yDelta;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public int getSquaredDistance() {
		return (this.x * this.x) + (this.y * this.y);
	}
	
	public String toString() {
		return "(" + this.getX() + ", " + this.getY() + ")";
	}
}
