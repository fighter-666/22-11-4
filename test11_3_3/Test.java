package test11_3_3;

import java.security.PublicKey;

class Person{
	private String name;
	
	public Person() {
		this("李四");
	}
	public Person(String name) {
		this.name = name;
		
	}
	public void speak() {
		System.out.println("大家好，我叫" + name);
	}
}

public class Test {
	public static void main(String[] args) {
		Person p = new Person();
		p.speak();
	}
}
