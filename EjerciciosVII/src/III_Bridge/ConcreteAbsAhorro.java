package III_Bridge;

public class ConcreteAbsAhorro implements IAbstractionCuenta{

	private IImplementorMoneda implementor;
	private int porInteres = 2;
	
	public ConcreteAbsAhorro (IImplementorMoneda implementor) {
		this.implementor = implementor;
	}

	@Override
	public void showInfo() {
		System.out.println("Cuenta a Ahorro\nInteres: "+porInteres+"%\nMoneda Original: "+implementor.type()+"\nMonto en Bolivianos: "+implementor.cambio()+" Bs.\n");
		
	}

}
