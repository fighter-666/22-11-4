package test2;

public class Mic implements USB {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("麦克风打开了");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("麦克风关闭了");
	}

}
