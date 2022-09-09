
public class polymorphism {

	public static class Animal{
		public void talk() {
			System.out.println("I am animal");
		}
	public class Cow extends Animal{
		public void talk() {
			System.out.println("Moo");
		}
	}
	public class Cat extends Animal{
		public void talk() {
			System.out.println("Miyav");
		}
	}
	public class Dog extends Animal{
		public void talk() {
			System.out.println("Hav Hav");
		}
	}
	
	
	public static void main(String[] args) {
		Animal[] a = new Animal[3];
		a[0] = new Animal().new Cat();
		a[1] = new Animal().new Cow();
		a[2] = new Animal().new Dog();
		for(int i = 0; i < 3; i++)
			a[i].talk();
	}
	}
}
