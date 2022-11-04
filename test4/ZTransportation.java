package test4;

public class ZTransportation extends Transportation implements Careable{

		
	public ZTransportation() {
		super();
	}
	public ZTransportation(String number, String model, String admin) {
		super(number, model, admin);
	}

	public void transport() {
		System.out.println("运输进行中");

	}
	
}
