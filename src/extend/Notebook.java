package extend;

//繼承同時, 也繼承了型態, 等於此類別有 Notebook跟Product兩種型態
public class Notebook extends Product {

	public int warranty;
	
	public Notebook(String name, int price, int warranty) {
		//當有繼承父類別時, 一定會呼叫父類別建構方法,預設為super();
		//如果有手動呼叫其他建構方法, 則失效
		/*
		//setName(name);
		this.name = name; //private封裝情況下不能使用, protected 可以
		setPrice(price);  //private封裝情況下需要使用, protected 兩種都可以
		//this.price = price; 
		*/
		super(name, price);
		this.warranty = warranty;
		
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
	// override 複寫, 必須平行方法
	@Override 
	//註釋, compile 會檢查這個方法是不是繼承而來, 
	//如果沒有@override, 即使下面想要繼承的方法打錯了, 也不會被檢查到
	public String desc() {
		// TODO Auto-generated method stub
		//String info = String.format("商品名稱:%S, 價錢:%d元,保固天數:%d天", this.name, this.price,this.warranty);
		// super 呼叫父類別方法, 父列別方法更動時一起連動
		String info = String.format("%S, 保固天數:%d天", super.desc(), this.warranty);
		return info;
	}

	/*
	//當父類別為abstract類別時, 必須改寫abstract方法 或著子類別也成為抽象類別(不能new物件)
	@Override
	public void calc() {
	
	}
	*/
	
	
}
