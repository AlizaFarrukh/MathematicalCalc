
public class Rectangle {
	private double width;
	private double height;

	
	public  double  area(double w, double h) {
		return 2*4*w*h;
	}
	
	public  double totalDistance(double w , double h) {
		return area(w,h);
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

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
