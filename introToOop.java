package springIntro;

public class introToOop {

	private class Car {
		String brand;
		String color;
		int engine;
		int capasity;

		public void run(String br, String cr, int eng, int cp) {
			brand = br;
			color = cr;
			engine = eng;
			capasity = cp;
		}

		public void print() {
			System.out.println(brand + "\t" + color + "\t" + engine + "\t" + capasity + "\t");
		}

		public static void main(String[] args) {
			Car truck = new Car();
			Car taxi = new Car();
			truck.run("BMC", "Red", 3000, 9000);
			taxi.run("Opel", "Gray", 1299, 2500);
			truck.print();
			taxi.print();
		}
	}
}
