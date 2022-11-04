package test11_2_3;

public class Return {
	public static void main(String[] args) {
		int area = getArea(3, 4);
		System.out.println(area);
	}
	public static int getArea(int x, int y) {
		return x * y;
	}
}
