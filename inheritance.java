public class inheritance {

	public static class Vehicles{
		protected int mSpeed = 0;
		private String color = "yellow";
		private boolean situation = false;
	public void run(int speed) {
		situation = true;
		if(situation == true)
			mSpeed = speed;
	}
	public void stop() {
		if(situation == true) {
			mSpeed = 0;
			situation = false;
		}
	}
	public void show() {
		System.out.println("Running = " + situation + "\nSpeed = " + mSpeed
				+ "\nColor = " + color);
	}
	public class Taxi extends Vehicles{
		public void fastRun() {
			mSpeed += 50;
			System.out.println("Instantaneous = " + mSpeed);
		}
	}
	public class Truck extends Vehicles{}	
	
	public static void main(String[] args) {
		Taxi opel = new Vehicles().new Taxi();
		Truck bmc = new Vehicles().new Truck();
		System.out.println("Car");
		opel.run(50); opel.show(); opel.fastRun(); opel.show();
		System.out.println("Truck");
		bmc.run(30); bmc.show(); bmc.stop(); bmc.show();
		
	}
	}
}
