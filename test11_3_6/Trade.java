package test11_3_6;

public class Trade {
	public static void main(String[] args) {
		Bank.bankName = "招商银行";
		Bank.welcome();
		Bank bank = new Bank("张三","123456",1000);
		bank.deposit(500);
		bank.withdrawal("1234567", 200);
		bank.withdrawal("123456", 2000);
		bank.withdrawal("123456", 200);
		bank.welcomeNext();
	}
}
