package test11_3_6;

public class Bank {
	static String bankName;
	private String name;
	private String password;
	private double balance;
	private double turnover;
	public static void welcome() {
		System.out.println("欢迎来到" + bankName + "----------");
	}
	
	
	public Bank(String name, String password,  double turnover) {
		
		this.name = name;
		this.password = password;
		this.balance = turnover - 10;
		System.out.println(name+"您的帐户余额" + balance);
		
	}
	
	public void deposit(double turnover) {
		balance = balance + turnover;
		System.out.println(name + "您好！您的账户已经存入" + turnover + "元"+
		"当前余额" + balance + "元");
	}
	
	public void withdrawal(String password,double turnover) {
		if(this.password != password) {
			System.out.println("密码错误");
			return;
		}
		if(balance - turnover > 0) {
			balance=balance-turnover;
			System.out.println("您好！您的账户已取出" + turnover + "元，当前余额" + balance + "元");
			
		}else {
			System.err.println("对不起，账户余额不足！");
		}
	}
	static void welcomeNext() {
		System.out.println("请随身携带财物，欢迎下次光临" + bankName + "-----------");
	}
	
}
