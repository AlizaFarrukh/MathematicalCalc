
public class Circle {
	private double radius;

	
	public double  area(double r) {
		return Math.PI *r*r;
	}
	
	public  double totalDistance(double r) {
		return 0;
	}
	
	public  int noOfSides() {
		return 0;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
