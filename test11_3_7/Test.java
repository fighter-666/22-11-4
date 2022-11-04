package test11_3_7;

class Animal{
	String name;
	public void shout() {
		System.out.println("汪汪汪");
	}
}
class Dog extends Animal{
	public void printName() {
		System.out.println("name=" + name);
	}
}

public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.name = "哈巴狗";
		dog.printName();
		dog.shout();
	}
}
