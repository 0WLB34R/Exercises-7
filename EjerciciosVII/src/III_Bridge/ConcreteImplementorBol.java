package III_Bridge;

public class ConcreteImplementorBol implements IImplementorMoneda {

	private int monto;
	private String type = "Bolivianos";

	public ConcreteImplementorBol(int monto) {
		this.monto = monto;
	}

	@Override
	public int cambio() {
		return monto;
	}

	@Override
	public String type() {
		return type;
	}

}
