package assignment.one.mca;

public class MethodOverloading {
	// area of square
	public int area(int a) {
		return a*a;
	}
	
	public double area(double a) {
		return a*a;
	}
	// area of ellipse
	public double area(int a, int b) {
		return Math.PI*a*b;
	}
	
	public static void main(String[] args) {
		MethodOverloading overloadObject = new MethodOverloading();
		System.out.println("Area of circle without decimal: " + overloadObject.area(5));
		System.out.println("Area of circle with decimal: " + overloadObject.area(5.67));
		System.out.println("Area of ellipse: " + overloadObject.area(5, 6));
	}

}
