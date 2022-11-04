package test1;
interface Animal{
	public static final String ANIMAL_BEHAVIOR = "动物行为:";
	public abstract void breathe();
	public abstract void run();
}

interface LandAnimal extends Animal{
	public abstract void liveOnLand();
}

class Dog implements LandAnimal{
	public void breathe() {
		System.out.println(ANIMAL_BEHAVIOR + "狗在呼吸");
	}
	public void run() {
		System.out.println(ANIMAL_BEHAVIOR + "狗在奔跑");
	}
	public void liveOnLand() {
		System.out.println("都是陆地生物");
	}
}

public class Test_1 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.breathe();
		dog.run();dog.liveOnLand();
	}
}
