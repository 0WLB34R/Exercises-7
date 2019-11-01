package II_Adapter;

public class ConcreteElecAPhone implements IAdapter{

	@Override
	public void precio() {
		System.out.println("Precio: 40.00 ");
		
	}

	@Override
	public void tiempoDeVida() {
		System.out.println("Tiempo de Vida: 5");
		
	}

	@Override
	public void clase() {
		System.out.println("Clase: Telefono");
		
	}
	
	@Override
	public void show() {
		clase();
		precio();
		tiempoDeVida();
		System.out.println();
	}
	
}
