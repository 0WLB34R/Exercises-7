package III_Bridge;

public class ConcreteAbsPlazoFijo implements IAbstractionCuenta{

	private IImplementorMoneda implementor;
	private int porInteres = 5;
	
	public ConcreteAbsPlazoFijo (IImplementorMoneda implementor) {
		this.implementor = implementor;
	}

	@Override
	public void showInfo() {
		System.out.println("Cuenta a Plazo Fijo\nInteres: "+porInteres+"%\nMoneda Original: "+implementor.type()+"\nMonto en Bolivianos: "+implementor.cambio()+" Bs.\n");
		
	}

}
