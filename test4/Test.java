package test4;

public class Test {
	private String number;
	private double goodsWeight;
	
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Test(String number, double goodsWeight) {
		super();
		this.number = number;
		this.goodsWeight = goodsWeight;
	}
	
	public void sendBefore() {
		System.out.println("订单处理，仓库存货中");
		System.out.println("货物重量：" + this.goodsWeight + "公斤");
		System.out.println("获取检验完毕");
		System.out.println("货物填装完毕");
		System.out.println("快递单号：" + this.number);
	}
	public void send() {
		
	}
	
}
