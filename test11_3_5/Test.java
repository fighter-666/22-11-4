package test11_3_5;

class Outer{
	private int num = 4;
/*
	public void test() {
		Inner inner = new Inner();
		inner.show();
	}*/

	class Inner{
		
		public void show() {
			
			System.out.println("num =" + num);
		}
	}
}
public class Test {
	public static void main(String[] args) throws Exception{
		//Outer outer = new Outer();
		//outer.test();
		Outer.Inner inner = new Outer().new Inner();
		inner.show();
	}
}
