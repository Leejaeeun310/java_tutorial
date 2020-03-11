package day7.edu.hgu;

public class ShopService {
	private static ShopService singleton = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {return singleton;}
	
	
}
