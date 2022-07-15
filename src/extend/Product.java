package extend;

public abstract class Product {

	//系統常數常使用public static final, 名稱常用全大寫, 顯示為斜體字
	public static final double TAX = 0.05;
	static {
		System.out.println("只會執行一次");
		
	}
	
	// public abstract void calc();
	
	
	/*
	private String name;
	private int price;
	*/
	
	protected String name;
	protected int price;
	
	public Product() {
	}

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	// override
	public String desc() {
		String info = String.format("商品名稱:%S, 價錢:NT %d元", this.name, this.price);
		return info;
	}
	
}
