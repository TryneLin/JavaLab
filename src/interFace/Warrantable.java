package interFace;

public interface Warrantable {

	int MAX_WARRANTY = 365; 
	// = public static final int MAX_WARRANTY = 365 

	public int 保固天數();
	
	//Java8 擴充功能, 介面可以有實作方法, 利用default(可以在類別中再覆寫)/static(不可以再覆寫)
	default int 檢測費用() {
		return 500;
	}
	
}
