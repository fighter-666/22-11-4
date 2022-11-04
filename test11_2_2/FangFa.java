package test11_2_2;

public class FangFa {
	public static void main(String[] args) {
		printRectangle(3, 2);
		printRectangle(2, 5);
		printRectangle(5, 4);
	}
	public static void printRectangle(int y, int x) {
		for(int i = 0; i<y;i++) {
			for(int j=0;j<x;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
