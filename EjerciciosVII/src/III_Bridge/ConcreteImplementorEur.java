package III_Bridge;

public class ConcreteImplementorEur implements IImplementorMoneda{

	private int monto;
	private String type = "Euros";
	
	public ConcreteImplementorEur(int monto) {
		this.monto = monto;
	}

	@Override
	public int cambio() {
		return monto*2;	
	}

	@Override
	public String type() {
		return type;
	}
	
	
	
}
