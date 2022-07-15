package extend;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Food extends Product {


    private Date expireDate;
    // Date 來源: java.utility.Date / java.sql.Date

    public Food(String name, int price, Date expireDate) {
        super(name, price);
        this.expireDate = expireDate;
    }

    @Override
    public String desc() {
        String description = super.desc();
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");//2022/04/18 日期格式化 yyyy/MM/dd HH:mm:ss
        description = description +",到期日： "+ format.format(expireDate);
        return description;
    }
}
