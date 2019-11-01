package III_Bridge;

public class ConcreteImplementorDol implements IImplementorMoneda {

	private int monto;
	private String type = "Dolares";

	public ConcreteImplementorDol (int monto) {
		this.monto = monto;
	}

	@Override
	public int cambio() {
		return monto * 7;
	}

	@Override
	public String type() {
		return type;
	}

}
