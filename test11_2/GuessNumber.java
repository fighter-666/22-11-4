package test11_2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		int randomNumber = new Random().nextInt(10);
		System.out.println("随机数生成");
		System.out.println("请输入数字");
		Scanner sc = new Scanner(System.in);
		int enterNumber = sc.nextInt();
		while(enterNumber != randomNumber) {
			 if(enterNumber > randomNumber) {
				 System.out.println("猜大了");
			 }else {
				 System.out.println("猜小了");
			 }
			 System.out.println("请输入您的数字");
			 enterNumber = sc.nextInt();
		}
		System.out.print("猜对了");
	}
}
