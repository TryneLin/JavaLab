package interFace;

import java.text.SimpleDateFormat;
import java.util.Date;

// 型態: SimCard, Product, Warranable, Expirable
public class SimCard extends Product implements Warrantable, Expirable {

	private int warranty;
	private Date expiredate;

	public SimCard(String name, int price, int warranty, Date expiredate) {
		super(name, price);
		this.warranty = warranty;
		this.expiredate = expiredate;
	}

	@Override
	public int 保固天數() {
		// TODO Auto-generated method stub
		return warranty;

	}

	@Override
	public Date 最後使用期限() {
		// TODO Auto-generated method stub
		return expiredate;
	}

	@Override
	public String desc() {
		String description = super.desc();
		SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");// 2022/04/18 日期格式化 yyyy/MM/dd HH:mm:ss
		description = description + ",最後開卡日： " + format.format(expiredate) + ",保固使用 " + warranty + "天";
		return description;
	}

}
