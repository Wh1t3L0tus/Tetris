package coordinate;

public class Coordinate {
	public int x;
	public int y;
	
	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Coordinate() {
		this(0, 0);
	}
	
	public Coordinate(Coordinate c) {
		this(c.x, c.y);
	}
}
