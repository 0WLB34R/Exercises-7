package II_Adapter;

public class ConcreteElecAComputer implements IAdapter{

	@Override
	public void precio() {
		System.out.println("Precio: 50.00 ");
		
	}

	@Override
	public void tiempoDeVida() {
		System.out.println("Tiempo de Vida: 7");
		
	}

	@Override
	public void clase() {
		System.out.println("Clase: Computadora");
		
	}
	
	@Override
	public void show() {
		clase();
		precio();
		tiempoDeVida();
		System.out.println();
	}
	
}
