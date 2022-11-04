package test3;

interface Aniaml{
	public abstract void shout();
}

class Cat implements Aniaml{

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("喵喵喵");
	}
	
}
class Dog implements Aniaml{

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("汪汪汪");
	}
}
	
public class Test {
	public static void main(String[] args) {
		Aniaml c1 = new Cat();
		Aniaml c2 = new Dog();
		animalShout(c1);
		animalShout(c2);
	}
	public static void animalShout(Aniaml a) {
		a.shout();
	}
}
