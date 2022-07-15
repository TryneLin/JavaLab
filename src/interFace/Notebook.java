package interFace;

// 型態: Notebook, Product, Warrantable
public class Notebook extends Product implements Warrantable {

	@Override
	public int 保固天數() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int warranty;
	
	public Notebook(String name, int price, int warranty) {
		super(name, price);
		this.warranty = warranty;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
	@Override 
	public String desc() {
		String info = String.format("%S, 保固天數:%d天", super.desc(), this.warranty);
		return info;
	}

}
