abstract class Animal{
	public abstract void talk();
}
class Cow extends Animal{
	public void talk() {
		System.out.println("Moo");
	}
}
class Cat extends Animal{
	public void talk() {
		System.out.println("Miyav");
	}
}
class Dog extends Animal{
	public void talk() {
		System.out.println("Hav Hav");
	}
}
class Test{
public static void main(String[] args) {
	Animal a[] = new Animal[3];
	a[0] = new Cat();
	a[1] = new Dog();
	a[2] = new Cow();
	System.out.println("Animals talking");
	for(int i = 0; i < 3; i++)
		a[i].talk();
}

}


