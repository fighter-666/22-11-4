package test11_3;

public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Product shopping(Market market,String name) {
		return market.sell(name);
	}
}
