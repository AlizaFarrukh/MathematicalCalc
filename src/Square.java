
public class Square {
	private double width;
	
	
	public  double  area(double w) {
		return 4*w;
	}
	
	public  double totalDistance(double w) {
		return area(w);
	}
	
	public  int noOfSides() {
		return 4;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
}
