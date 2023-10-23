package ch07.sec10.exam02;

public class AbstractMethodExample {
	public static void main(String[] args) {
		animalSound(new Dog());
		animalSound(new Cat());
//		Dog dog = new Dog();
//		Cat cat = new Cat();
//		dog.sound();
//		cat.sound();
//		dog.breath();
//		cat.breath();
	}
		public static void animalSound(Animal animal) {
			animal.sound();
		}
	}