
public class Main {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle();
		rect.setHeight(1.2);
		rect.setWidth(2.5);
		System.out.printf("Area of Rectangle is  %f\n",rect.area(rect.getHeight(), rect.getWidth()));
		System.out.printf("No of sides of Rectangle is %d\n",rect.noOfSides());
		System.out.printf("Total distance of Rectangle is %f\n",rect.totalDistance(rect.getHeight(), rect.getWidth()));
		
		Circle circle = new Circle();
		circle.setRadius(12);
		
		System.out.printf("Area of Circle is %f\n",circle.area(circle.getRadius()));
		System.out.printf("No of sides of Circle is %d\n",circle.noOfSides());
		System.out.printf("Tot"
				+ ""
				+ "al distance of Circle is %f\n",circle.totalDistance(circle.getRadius()));
		
		Square square = new Square();
		square.setWidth(2.5);
		System.out.printf("Area of Square is %f\n",square.area(square.getWidth()));
		System.out.printf("No of sides of Square is %d\n",square.noOfSides());
		System.out.printf("Total distance of Square is %f\n",square.totalDistance(square.getWidth()));
		
	}

}
