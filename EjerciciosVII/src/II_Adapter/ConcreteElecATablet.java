package II_Adapter;

public class ConcreteElecATablet implements IAdapter {

	@Override
	public void precio() {
		System.out.println("Precio: 30.00 ");

	}

	@Override
	public void tiempoDeVida() {
		System.out.println("Tiempo de Vida: 3");

	}

	@Override
	public void clase() {
		System.out.println("Clase: Tablet");

	}

	@Override
	public void show() {
		clase();
		precio();
		tiempoDeVida();
		System.out.println();
	}

}
