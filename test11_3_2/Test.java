package test11_3_2;


 class Person{
	private int age;
	
	public Person(int age) {
		this.age = age;
	}
	
	public void speak(){
		System.out.println("我今年已经" +age + "岁了");
	}
}

public class Test {
	public static void main(String[] args) {
		Person p = new Person(21);
		p.speak();
	}
}
