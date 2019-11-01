package III_Bridge;

public class ConcreteAbsCredito implements IAbstractionCuenta{

	private IImplementorMoneda implementor;
	private int porInteres = 0;
	
	public ConcreteAbsCredito (IImplementorMoneda implementor) {
		this.implementor = implementor;
	}

	@Override
	public void showInfo() {
		System.out.println("Cuenta a Credito\nInteres: "+porInteres+"%\nMoneda Original: "+implementor.type()+"\nMonto en Bolivianos: "+implementor.cambio()+" Bs.\n");
		
	}

}
