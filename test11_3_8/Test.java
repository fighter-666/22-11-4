package test11_3_8;
class Animal{
	public Animal(String name) {
		System.out.println("我是一只"+name);
		//System.out.println("父类构造方法");
	}
}
class Dog extends Animal {
	public Dog() {
		super("哈皮狗");
		//System.out.println("子类构造方法");
	}
}
public class Test {
	public static void main(String[] args) {
		Dog dog = new Dog();
		
	}
}
