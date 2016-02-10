
public class Drunkard {
	private int avenue;
	private int street;
	private int distance;
	public Drunkard(int a, int s) {
		avenue = a;
		street = s;
		
	}
	public void step() {
		int direction = (int )(Math.random() * 4);
		if (direction == 1) {
			this.avenue = this.avenue + 1;
		}
		if (direction == 2) {
			this.avenue = this.avenue - 1;
		}
		if (direction == 3) {
			this.street = this.street + 1;
		}
		if (direction == 0) {
			this.street = this.street - 1;
		}
	}
	public void fastForward(int steps) {
		for (int step = steps; step > 0; step--) {
			step();
		}
	}
	public String getLocation() {
		String location = "X: " + this.avenue + ", Y: " + this.street;
		return location;
	}
	public int howFar() {
		if (this.avenue > 0) {
			return distance;
		}
		else {
			return distance;
		}
	}
}

