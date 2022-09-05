public class constructorsFunctions {

	public static class constructor{
		double pi, r;
		public constructor() {
			pi = 3.14;
			r = 4;
		}
		public constructor(double x, double y) {
			pi = x;
			r = y;
		}
		double field() {
			return pi * r;
		}
	
	public static void main(String[] args) {
		constructor field1 = new constructor();
		constructor field2 = new constructor(3.15, 5);
		System.out.println("Area of​​ a circle with a radius of 4 cm = " + field1.field());
		System.out.println("Area of​​ a circle with a radius of 5 cm = " + field2.field());
	}
	}
}
