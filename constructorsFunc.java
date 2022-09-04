package springIntro;

import springIntro.constructorsFunctions.Car;
import springIntro.constructorsFunctions.Car.Taxi;
import springIntro.constructorsFunctions.Car.Truck;

public class constructorsFunc {

	public static class Car{
		protected int mSpeed = 0;
		private String color = "Yellow";
		private boolean situation = false;
		public void run(int speed) {
			situation = true;
			if(situation == true)
				mSpeed += speed;
		}
		public void stop() {
			if(situation == true) {
				mSpeed = 0;
				situation = false;
			}
		}
		public void show() {
			System.out.println("Running = " + situation + "Speed = " + mSpeed);
			System.out.println("Color = " + color);
		}
		public class Taxi extends Car{
			public void fastMove() {
				mSpeed += 50;
				System.out.println("For now speed = " + mSpeed);
			}
		}
		public class Truck extends Car{}
	
	public static void main(String[] args) {
		Taxi opel = new Car().new Taxi();
		Truck bmc = new Car().new Truck();
		opel.run(30);
		opel.show();
		opel.fastMove();
		bmc.run(10);
		bmc.show();
		bmc.stop();
		bmc.show();	
	}
	}

}
