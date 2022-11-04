package test;

abstract class Animal{
	public abstract void shout();
	
	/*public void sleep() {
		System.out.println("动物在睡觉");
	}*/
}

class Dog extends Animal{
	public void shout() {
		System.out.println("汪汪汪");
	}
}

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.shout();
		//dog.sleep();
	}
}
