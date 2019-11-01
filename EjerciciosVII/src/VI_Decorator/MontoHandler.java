package VI_Decorator;

public class MontoHandler {

	private static MontoHandler adder;
	private int total;
	
	private MontoHandler() {
		
	}

	public static MontoHandler invoke() {
		if(adder == null) {
			adder = new MontoHandler();
		}
		
		return adder;
	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public int getTotal() {
		return total;
	}
	
	public void showBalance() {
		System.out.println("Monto actual en cuenta: "+total);
	}
	
}
