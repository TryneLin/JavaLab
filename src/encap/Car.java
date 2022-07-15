package encap;

public class Car {

	/*
	//一般class定義
	String model;
	int price;
	*/
	
	//封裝過程, 隱藏設計類別, private使用
	//右鍵[source -> getter and setter]
	private String model;
	private int price;
	private String color;
	

	
	public void setModel(String model) {
		this.model = model;
		if (model.equals("Prius")) {
			price = 1000000;
		} else if (model.equals("Yaris")){ 
			price = 575000;
		} else if (model.equals("kk")){ 
			price = 100;
		} else {
			this.model = "Error";
			System.out.println("輸入型號錯誤");
		}
	}
	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}
	
	//建構方法: 跟類別同名,沒有回傳值的宣告,
	
	
	//overloaded 多個相同名稱, 不同參數方法
	//overload
	public Car(String color) {
		this("Yaris",color);// 一定要在第一行
	//  this.color = color;//初始化屬性預設值
		
	}
	
	public Car(String model, String color) {
//		this.model = model;//初始化屬性預設值
		this.color = color;//初始化屬性預設值
		setModel(model);
	}
	
	public Car() {
		this.color = "白色";//初始化屬性預設值
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	
	/*
	//封裝過程, 隱藏設計類別, private使用[手動版本]
	private String model;
	int price;
	
	//自行設定model=傳入m值
	public void setModel(String model) { //一般參數名稱會和屬性一樣
		//當參數名稱和屬性名稱一樣,在方法中都會認定為參數(優先權較高)
		// this. 表示後面為屬性,而不是參數
		this.model = model;
	}
		
	//取得model的方法
	public String getModel() {
		return model;
	}
    */
	
	
	
	
	
	
}
